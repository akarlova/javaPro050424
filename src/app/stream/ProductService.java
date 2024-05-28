package app.stream;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class ProductService {

    public void getBookWithFixedPrice(List<Product> products) {

        products.stream()
                .filter(product
                        -> product.getType().equals("Book") && product.getPrice() > 250)
                .forEach(System.out::println);
    }

    public List<Product> discountBooks(List<Product> products, double discount) {

        List<Product> discountBooks = products.stream()
                .filter(product -> product.getType().equals("Book") && product.isDiscount)
                .map(product -> new Product(product.getType(), product.getPrice()
                        * (1 - discount / 100), product.isDiscount()))
                .toList();
        return discountBooks;
    }

    public void discountBooksPrint(List<Product> products, double discount) {

        products.stream()
                .filter(product -> product.getType().equals("Book"))
                .filter(product -> product.isDiscount)
                .map(product -> new Product(product.getType(), product.getPrice()
                        * (1 - discount / 100), product.isDiscount(), product.getDate()))
                .forEach(System.out::println);
    }

    public Product getCheapestBook(List<Product> products) {

        Product theCheapestBook = products.stream()
                .filter(product -> product.getType().equals("Book"))
                .sorted((prod1, prod2) -> Double.compare(prod1.getPrice(), prod2.getPrice()))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("None Book was found"));
        return theCheapestBook;
    }

    public void getLastThreeAddedProducts(List<Product> products) {

        products.stream()
                .sorted((prod1, prod2) -> (prod2.getDate().compareTo(prod1.getDate())))
                .limit(3)
                .forEach(System.out::println);
    }

    public double calcSelectedBooks(List<Product> products) {

        double result = products.stream()
                .filter(product -> product.getType().equals("Book"))
                .filter(product -> product.getDate().getYear() == LocalDate.now().getYear())
                .filter(product -> product.getPrice() <= 75)
                .reduce(0.0, (sum, product) -> sum + product.getPrice(), Double::sum);

        return result;
    }

    public void groupByType(List<Product> products) {

        Map<String, List<Product>> groupedProducts = products.stream()
                .collect(Collectors.groupingBy(Product::getType));

        groupedProducts.forEach((type, value) -> {
            System.out.println(type + ": ");
            value.forEach(product -> System.out.println(" " + product));
        });
    }
}

package app.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//for tests
public class Main {
    public static void main(String[] args) {

        ProductService service = new ProductService();

        List<Product> products = new ArrayList<>();
        products.add(new Product("Book", 250, false, LocalDate.now()));
        products.add(new Product("Book", 300, true, LocalDate.of(2024, 4, 24)));
        products.add(new Product("Toy", 300, true, LocalDate.of(2020, 5, 23)));
        products.add(new Product("Toy", 400, true, LocalDate.of(2021, 12, 31)));
        products.add(new Product("Book", 550, true, LocalDate.of(2024, 1, 24)));
        products.add(new Product("Book", 600, true, LocalDate.of(2020, 5, 26)));
        products.add(new Product("Book", 70, false, LocalDate.of(2024, 5, 21)));

        service.getBookWithFixedPrice(products);
        service.discountBooksPrint(products, 10);
        System.out.println(service.getCheapestBook(products));
        service.getLastThreeAddedProducts(products);
        System.out.println(service.calcSelectedBooks(products));
        service.groupByType(products);
    }
}

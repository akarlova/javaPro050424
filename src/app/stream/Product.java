package app.stream;

import java.time.LocalDate;

public class Product {

    private String type;
    private double price;
    boolean isDiscount;
    private LocalDate date;

    public Product(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public Product(String type, double price, boolean isDiscount) {
        this.type = type;
        this.price = price;
        this.isDiscount = isDiscount;
    }

    public Product(String type, double price, boolean isDiscount, LocalDate date) {
        this.type = type;
        this.price = price;
        this.isDiscount = isDiscount;
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDiscount() {
        return isDiscount;
    }

    public void setDiscount(boolean discount) {
        isDiscount = discount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", isDiscount=" + isDiscount +
                ", date=" + date +
                '}';
    }
}

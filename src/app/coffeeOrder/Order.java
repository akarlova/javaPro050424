package app.coffeeOrder;

import java.lang.Comparable;

public class Order implements Comparable<Order> {

    private final int orderNumber;
    private final String customerName;

    public Order(int orderNumber, String customerName) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
    }
    public int getOrderNumber() {
        return orderNumber;
    }
    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String toString() {
        return "\n"+getOrderNumber()+" | "+getCustomerName();
    }

    @Override
    public int compareTo(Order order) {
        return this.getOrderNumber()-order.getOrderNumber();
    }
}


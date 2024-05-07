package app.coffeeOrder;

import java.lang.Comparable;

public class Order implements Comparable<Order> {

    private static int nextOrderID = 1;

    private final int orderNumber;
    private final String customerName;

    public Order(String customerName) {
        this.orderNumber = nextOrderID++;
        this.customerName = customerName;
    }
    public int getOrderNumber() {
        return orderNumber;
    }
    public void setOrderNumber(int orderNumber) {
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


package app.coffeeOrder;


import java.util.Iterator;
import java.util.PriorityQueue;

import java.util.TreeSet;

public class CoffeeOrderBoard {

    private TreeSet<Order> coffeeOrders;

    public CoffeeOrderBoard() {
        this.coffeeOrders = new TreeSet<>();
    }

    public void add(Order order) {

        coffeeOrders.add(order);
    }

    public void deliver() {


        if (!coffeeOrders.isEmpty()) {

            System.out.println(coffeeOrders.removeFirst() + " is ready");

        }
    }

    public void deliverThisOrder(Integer number) {

        Iterator<Order> iterator = coffeeOrders.iterator();

        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getOrderNumber() == number) {
                System.out.println(order + " is already ready");
                iterator.remove();
            }
        }
    }

    public void draw() {

        System.out.println("===================");
        System.out.println("Num | Name");
        for (Order order : coffeeOrders) {
            System.out.println(order.getOrderNumber() + " | " + order.getCustomerName());
        }
        System.out.println("===================");
    }


}

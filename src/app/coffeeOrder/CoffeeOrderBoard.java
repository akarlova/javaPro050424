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

        PriorityQueue<Order> todayOrders = new PriorityQueue<>(coffeeOrders);
        if (!todayOrders.isEmpty()) {

            System.out.println(todayOrders.remove() + " is ready");
            coffeeOrders.removeFirst();
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

        System.out.println(coffeeOrders);
    }

    @Override
    public String toString() {
        return "\nNum | Name\n" +
                coffeeOrders;
    }
}

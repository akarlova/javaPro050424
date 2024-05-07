package app.coffeeOrder;

import java.util.Iterator;
import java.util.TreeSet;

public class CoffeeOrderBoard {

    private TreeSet<Order> coffeeOrders;

    public CoffeeOrderBoard() {
        this.coffeeOrders = new TreeSet<>();
    }
    public void add(Order order) {
        int orderNumber = coffeeOrders.size()+1;
        coffeeOrders.add(order);
        order.setOrderNumber(orderNumber);

    }

    public void deliver() {
        if (!coffeeOrders.isEmpty()) {

            Order deliveredOrder = coffeeOrders.removeFirst();
            System.out.println(deliveredOrder + " is ready.");
        } else {
            System.out.println("No orders to deliver.");
        }
    }
    public void deliverOrderByNumber(int number) {
        Iterator<Order> iterator = coffeeOrders.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getOrderNumber() == number) {
                System.out.println(order + " is already ready");
                iterator.remove();
            }
        }
    }

    public Order deliveryByNumberAnotherVariant(int number) {
        for (Order order : coffeeOrders) {
            if(order.getOrderNumber()==number){
                coffeeOrders.remove(order);
                return order;
            }
        }
        System.out.println("No order found for number " + number);
        return null;

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

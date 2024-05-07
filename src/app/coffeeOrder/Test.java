package app.coffeeOrder;


public class Test {

    public static void main(String[] args) {

        CoffeeOrderBoard todayCoffeeBoard = new CoffeeOrderBoard();

        todayCoffeeBoard.add(new Order("Kate"));
        todayCoffeeBoard.add(new Order("Tanya"));
        todayCoffeeBoard.add(new Order("Sasha"));
        todayCoffeeBoard.add(new Order("Feng"));
        todayCoffeeBoard.add(new Order("Misha"));
        todayCoffeeBoard.add(new Order("Den"));
        todayCoffeeBoard.add(new Order("Yoda"));
        todayCoffeeBoard.add(new Order("Dio"));
        todayCoffeeBoard.add(new Order("Jojo"));
        todayCoffeeBoard.add(new Order("Inglou"));


        todayCoffeeBoard.draw();
        todayCoffeeBoard.deliver();
        todayCoffeeBoard.deliver();
        todayCoffeeBoard.deliveryByNumberAnotherVariant(5);
        todayCoffeeBoard.deliverOrderByNumber(7);
        todayCoffeeBoard.draw();
Order order = new Order("Katya");
        System.out.println(order);

    }
}

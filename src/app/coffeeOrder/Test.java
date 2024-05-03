package app.coffeeOrder;


public class Test {

    public static void main(String[] args) {

        CoffeeOrderBoard todayCoffeeBoard = new CoffeeOrderBoard();

        todayCoffeeBoard.add(new Order(1,"Kate"));
        todayCoffeeBoard.add(new Order(2,"Tanya"));
        todayCoffeeBoard.add(new Order(3,"Sasha"));
        todayCoffeeBoard.add(new Order(10,"Feng"));
        todayCoffeeBoard.add(new Order(9,"Misha"));
        todayCoffeeBoard.add(new Order(8,"Den"));
        todayCoffeeBoard.add(new Order(6,"Yoda"));
        todayCoffeeBoard.add(new Order(7,"Dio"));
        todayCoffeeBoard.add(new Order(5,"Jojo"));
        todayCoffeeBoard.add(new Order(4,"Inglou"));


        todayCoffeeBoard.draw();

        todayCoffeeBoard.deliver();
        todayCoffeeBoard.deliver();

        todayCoffeeBoard.draw();

        todayCoffeeBoard.deliverThisOrder(7);

        todayCoffeeBoard.draw();

    }
}

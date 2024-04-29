package app.HW3_0;

public class Test {

    public static void main(String[] args) {

        Area[] figures = new Area[3];
    
        figures[0] = new Circle(7);
        figures[1] = new Square(8);
        figures[2] = new Triangle(7, 12);


        getTotalArea(figures);
    }

    private static void getTotalArea(Area[] figures) {
        double totalArea = 0;
        for (Area figure : figures) {
            double area = figure.getShapeArea();
            totalArea += area;
        }
        System.out.printf("Area of all figures is %.2f", totalArea);
    }
}

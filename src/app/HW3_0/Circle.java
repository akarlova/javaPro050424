package app.HW3_0;

public class Circle implements Area{

    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    @Override
    public double getShapeArea() {
        return Math.PI * radius * radius;
    }
}

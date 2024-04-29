package app.HW3_0;

public class Triangle implements Area {

    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    @Override
    public double getShapeArea() {
        return (height*base)/2;
    }
}

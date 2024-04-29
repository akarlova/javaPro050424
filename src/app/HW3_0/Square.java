package app.HW3_0;

public class Square implements Area {

    private double sideSquare;

    public Square(double sideSquare) {
        this.sideSquare = sideSquare;
    }

    public double getSideSquare() {
        return sideSquare;
    }

    @Override
    public double getShapeArea() {
        return sideSquare*sideSquare;
    }
}

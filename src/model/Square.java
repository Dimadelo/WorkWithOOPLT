package model;

public class Square extends  AbstractShape implements Shape{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public Square() {
    }

    @Override
    public double getArea() {
        return side*side;
    }
}







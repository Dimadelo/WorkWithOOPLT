package model;

public class Circle extends AbstractShape {

    private static Circle circle;

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static Circle getInstance() {
        if (circle != null) {
            return circle;
        } else {
            circle = new Circle();
            return circle;

        }
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }


    @Override
    public double getPerimeter() {
        return 0;

    }
}
package model;

public class Triangle extends AbstractShape {


    private double base;


    private double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}

    @org.jetbrains.annotations.Contract(pure = true)
    public Triangle(double base, double he) {
        this.base = base;
        this.height = heig
    }

    public Triangle() {
    }

    @Override
    double getArea() {
        return (base * height)/2;
    }
}

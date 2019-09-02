package model;

import java.util.logging.Logger;

public class Triangle extends AbstractShape {

    private static Logger logger = Logger.getLogger(Triangle.class.getName());

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

    public Triangle( double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public Triangle() {
    }

    @Override
    public double getArea() {
        return (base * height)/2;
    }

    public void getInfo() {
      logger.info("Triangle with base:" + base + " , height:" + height);
    }
}

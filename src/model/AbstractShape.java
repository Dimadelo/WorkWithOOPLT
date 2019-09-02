package model;

public abstract class AbstractShape implements Shape {

    private String className = "Abstract shape";

    public abstract double getPerimeter();

    public AbstractShape() {
        super();
    }

    public abstract double getArea() ;





}

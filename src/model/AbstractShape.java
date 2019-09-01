package model;

import java.awt.*;

public abstract class AbstractShape implements Shape {

    private String className = "Abstract shape";

    public abstract double getPerimeter();

    public AbstractShape() {
        super();
    }

    abstract double getArea () ;





}

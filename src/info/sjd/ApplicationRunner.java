package info.sjd;

import model.Circle;
import model.Square;
import model.Triangle;

import java.sql.SQLOutput;

public class ApplicationRunner {

    static String name = "ApplicationRunner class";

    public static void main(String[] args) {

       Circle circle1 = new Circle();
       circle1.radius = 15.0;

        Circle circle2 = new Circle();
        circle2.radius = 20.0;

        Circle circle3 = new Circle();
        circle3.radius = 10.0;

        System.out.println("Radius of circle is " + circle1.radius);
        System.out.println("Radius of circle is " + circle2.radius);
        System.out.println("Radius of circle is " + circle3.radius);

        Square square = new Square();
        square.side = 50;
        System.out.println("Side of square is " + square.side + " and square has area " + square.getArea() );


        Triangle triangle = new Triangle();
        triangle.base = 15.0;
        triangle.height = 10.0;
        System.out.println("Base of triangle is " + triangle.base + " and height of triangle is " + triangle.height );


    }











}
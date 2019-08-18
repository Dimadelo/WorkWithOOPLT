package info.sjd;

import model.Circle;
import model.Square;
import model.Triangle;

import java.sql.SQLOutput;

public class ApplicationRunner {

    static String name = "ApplicationRunner class";

    public static void main(String[] args) {

       Circle circle = new Circle();
       circle.radius = 15.0;
        System.out.println("Circle radius is " + circle.radius + " and circle has area " + circle.getArea());




        Square square = new Square();
        square.side = 50;
        System.out.println("Side of square is " + square.side + " and square has area " + square.getArea() );


        Triangle triangle = new Triangle();
        triangle.base = 15.0;
        triangle.height = 10.0;
        System.out.println("Base of triangle is " + triangle.base + " and height of triangle is "
                + triangle.height + " and triangle has area " + triangle.getArea()  );


    }











}

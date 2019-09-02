package info.sjd;

import model.*;

import java.sql.SQLOutput;
import java.util.concurrent.Callable;
import java.util.logging.Logger;

public class ApplicationRunner {

    private static Logger logger = Logger.getLogger(ApplicationRunner.class.getName());


    public static void main(String[] args) {

        Square square1 = new Square(65);
        Square square2 = new Square(75);
        Square square3 = new Square(85);
        Square square4 = new Square(95);
        Square square5 = new Square(105);
        Circle circle = new Circle(8);
        Triangle triangle = new Triangle(15, 10);

        Shape[] shapes = new Shape[7];

        shapes[0] = square1;
        shapes[1] = square3;
        shapes[2] = square3;
        shapes[3] = square4;
        shapes[4] = square5;
        shapes[5] = circle;
        shapes[6] = triangle;

        Shape maxShape = shapes[0];

        for (int i = 0; i < shapes.length; i++) {
            if (maxShape.getArea() < shapes[i].getArea()) {
                maxShape = shapes[i];
            }


        }
        logger.info("Max shape has area" + maxShape.getArea() + " and is " + maxShape.getClass().getSimpleName());

        maxShape = shapes[0];

        for (Shape shape : shapes) {
            if (maxShape.getArea() < shape.getArea()) {
                maxShape = shape;
            }

        }

        logger.info("Max shape has area" + maxShape.getArea() + " and is " + maxShape.getClass().getSimpleName());

//        maxShape = shapes[0];
//        int i = 0;
//        while (i < shapes.length) {
//            if (maxShape.getArea() < shape.getArea()) {
//                maxShape = shapes[i];
//            }
//            i++;
//        }
//
//
//        maxShape = shapes[0];
//        i = 0;
//            do {
//                if (maxShape.getArea() < shape.getArea()) {
//                    maxShape = shapes[i];
//                }
//                i++;
//            } while (i < shapes.length) {


//       Circle circle = new Circle();
//       circle.radius = 15.0;
//        System.out.println("Circle radius is " + circle.radius + " and circle has area " + circle.getArea());
//
//
//
//
//        Square square = new Square();
//        square.side = 50;
//        System.out.println("Side of square is " + square.side + " and square has area " + square.getArea() );
//
//
//        Triangle triangle = new Triangle();
//        triangle.base = 15.0;
//        triangle.height = 10.0;
//        System.out.println("Base of triangle is " + triangle.base + " and height of triangle is "
//                + triangle.height + " and triangle has area " + triangle.getArea()  );


        }


    }


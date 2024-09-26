package com.cbfacademy.shapes;

import java.util.List;

    public class MyShapesProgram {
        public static double computeArea(List<Enclosure> enclosures) {
            return enclosures.stream().mapToDouble(Enclosure::area).sum();
        }

        public static double computePerimeter(List<Enclosure> enclosures) {
            return enclosures.stream().mapToDouble(Enclosure::perimeter).sum();
        }

        public static void main(String[] args) {
            // Creating instances of Square and Circle
            Enclosure square1 = new Square(20);
            Enclosure square2 = new Square(4);
            Enclosure square3 = new Square(12);
            Enclosure circle1 = new Circle(15);
            Enclosure circle2 = new Circle(10);
            Enclosure circle3 = new Circle(5);

            // Adding them to a list
            List<Enclosure> shapesList = List.of(square1, square2, square3, circle1, circle2, circle3);

            // Computing total area and perimeter
            double totalArea = computeArea(shapesList);
            double totalPerimeter = computePerimeter(shapesList);

            //Finally, printing the results
            System.out.println("Total Area of all shapes: " + totalArea);
            System.out.println("Total Perimeter of all shapes: " + totalPerimeter);
        }
    }



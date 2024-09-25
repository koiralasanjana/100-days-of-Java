//Day-20 Create a class hierarchy with a base class Shape that has an abstract method calculateArea().
// Implement two subclasses Circle and Rectangle.
// The Circle class should have a property radius, and the Rectangle class should have properties
// length and width.
// Implement the calculateArea() method in both subclasses.
// Write a program to create an array of Shape objects, initialize it with Circle and Rectangle objects,
// and calculate and print the area of each shape using dynamic binding.

package Advanced;

import java.sql.PreparedStatement;

abstract class Shape {
    public abstract double calculateArea();

    public static void main(String[] args){
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5);
        shapes[1] = new rectangle(69f, 3f);

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class rectangle extends Shape{
    private float length;
    private float width;

    public rectangle(float length, float width){
        this.length=length;
        this.width=width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}


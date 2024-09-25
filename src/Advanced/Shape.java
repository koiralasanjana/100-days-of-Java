//Create a class hierarchy with a base class Shape that has an abstract method calculateArea().
// Implement two subclasses Circle and Rectangle.
// The Circle class should have a property radius, and the Rectangle class should have properties
// length and width.
// Implement the calculateArea() method in both subclasses.
// Write a program to create an array of Shape objects, initialize it with Circle and Rectangle objects,
// and calculate and print the area of each shape using dynamic binding.

package Advanced;

abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape{
    private float radius;
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class rectangle extends Shape{
    private float length;
    private float width;
    @Override
    public double calculateArea() {
        return length * width;
    }
}

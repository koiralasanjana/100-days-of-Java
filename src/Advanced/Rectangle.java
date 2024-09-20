//Day-17: Create a class Rectangle with private properties length and width.
// Provide public methods setLength(), setWidth(), getLength(), getWidth(), and calculateArea().
// Write a program to create a Rectangle object, set its dimensions, and print its area.

package Advanced;

public class Rectangle {
    private float length;
    private float width;

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public void calculateArea(){
        float area = getLength() * getWidth();
        System.out.println("Area: "+ area);
    }

    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10.22f);
        System.out.println("Length: "+rectangle.getLength());
        rectangle.setWidth(10f);
        System.out.println("Length: "+rectangle.getWidth());
        rectangle.calculateArea();
    }
}

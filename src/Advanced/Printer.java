//Create a class Printer with a method printDocument().
// Create two subclasses, InkjetPrinter and LaserPrinter, that override the printDocument()
// method to print specific messages.
// Write a program to demonstrate polymorphism by calling printDocument() on both subclasses.
package Advanced;

public class Printer {
    public void printDocument(){
        System.out.println("This is the main printer");
    }

    public static void main(String[] args){
        Printer inkjetPrinter = new InkjetPrinter();
        inkjetPrinter.printDocument();

        Printer laserPrinter = new LaserPrinter();
        laserPrinter.printDocument();
    }
}

class InkjetPrinter extends Printer{
    @Override
    public void printDocument(){
        System.out.println("This is the InkjetPrinter printer");
    }
}

class LaserPrinter extends Printer{
    @Override
    public void printDocument(){
        System.out.println("This is the LaserPrinter printer");
    }
}

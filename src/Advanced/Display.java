//Day-22: Write a class Display with two overloaded methods show().
//The first method takes an int parameter and prints it, while the second method takes a
// String parameter and prints it.
//Write a program to demonstrate method overloading.

package Advanced;

public class Display {
    public void show(int a){
        System.out.println(a);
    }
    public void show(String b){
        System.out.println(b);
    }

    public static void main(String[] args){
        Display display = new Display();
        int a = 5;
        String b = "Hello";
        display.show(a);
        display.show(b);
    }
}

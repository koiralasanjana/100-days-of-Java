//Create a class Calculator with methods add(int a, int b), subtract(int a, int b),
// multiply(int a, int b), and divide(int a, int b).
// Write a program to demonstrate using these methods.

package Advanced;

public class Calculator {
    public void add(int a, int b){
        int calc=0;
        calc=a+b;
        System.out.println("Sum: "+calc);
    }
    public void sub(int a, int b){
        int calc=0;
        calc=a-b;
        System.out.println("Difference: "+calc);
    }
    public void multiply(int a, int b){
        int calc=0;
        calc=a*b;
        System.out.println("Multiplication: "+calc);
    }
    public void divide(int a, int b){
        int calc=0;
        calc=a/b;
        System.out.println("Divide: "+calc);
    }

    public static void main(String[] args){
        Calculator calculator= new Calculator();
        calculator.divide(5,6);
    }
}

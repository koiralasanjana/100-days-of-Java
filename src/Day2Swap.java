//Write a program to swap the values of two variables without using a
// third variable. Print the values before and after swapping.
public class Day2Swap {
    int a=3, b=9;
    public void beforeSwap(){
        System.out.println("Before swap:\nFirst value:"+a+"\nSecond value:"+b);
        System.out.println("--------------------------------------------------");

    }
    public void afterSwap(){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap:\nFirst value:"+a+"\nSecond value:"+b);
    }
    public static void main(String[] args){
        Day2Swap swap=new Day2Swap();
        swap.beforeSwap();
        swap.afterSwap();
    }
}

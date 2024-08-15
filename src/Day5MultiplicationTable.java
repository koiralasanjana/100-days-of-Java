import java.util.Scanner;

//Write a program that prints the multiplication tables of a given number
// up to 10.
public class Day5MultiplicationTable {
    public void multiplication(int num1){
        for(int i=1; i<=10;i++) {
            int multiply = num1 * i;
            System.out.println(num1 + "*" + i + "=" + multiply);
        }
    }
    public static void main(String[] args){
        System.out.println("Enter desired number to generate multiplication table: ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        Day5MultiplicationTable multiply = new Day5MultiplicationTable();
        multiply.multiplication(num);
    }
}


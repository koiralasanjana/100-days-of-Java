//Write a program that takes an integer input from the user and prints
// whether it is a prime number.

import java.util.Scanner;

public class Day3Prime {
    public void prime(int a){
        int temp=0;
        for (int i=2; i<=a/2; i++){
            if (a%i==0){
                temp++;
                break;
            }
        }
        if (temp == 0 && a != 1) {
            System.out.println(a+" is a Prime number");
        }
        else {
            System.out.println(a+" is not a Prime number");
        }

    }
    public static void main(String[] args){
        System.out.println("Enter an integer value: ");
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        Day3Prime prime=new Day3Prime();
        prime.prime(x);
    }
}

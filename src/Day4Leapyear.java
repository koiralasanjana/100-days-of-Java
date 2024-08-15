//Write a program that takes a year as input from the user and checks
// if it is a leap year.

import java.util.Scanner;

public class Day4Leapyear {
    public void leap(int y){
        if(y%4==0){
            if(y%100!=0){
                if(y%400==0){
                    System.out.println(y+" is a leap year");
                }else {
                    System.out.println(y+" is not a leap year");
                }
            }else {
                System.out.println(y+" is not a leap year");
            }
        }else {
            System.out.println(y+" is not a leap year");
        }
    }
    public static void main(String[] args){
        System.out.println("Please enter a year: ");
        Scanner sc=new Scanner(System.in);
        int year= sc.nextInt();
        Day4Leapyear leap = new Day4Leapyear();
        leap.leap(year);
    }
}

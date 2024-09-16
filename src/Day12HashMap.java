//Write a program that uses a 'HashMap' to count the frequency of each character in a string.

import java.util.Scanner;

public class Day12HashMap {
    public void hashMap(String myString){
        System.out.println("My String: "+myString);
    }

    public static void main(String[] args){
        System.out.println("Please input your string: ");
        Scanner sc=new Scanner(System.in);
        String myString=sc.nextLine();
        Day12HashMap hashMap = new Day12HashMap();
        hashMap.hashMap(myString);
    }
}

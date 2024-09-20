//Write a program that uses a 'HashMap' to count the frequency of each character in a string.

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class Day12HashMap {
    public static Map<Character, Integer> hashMap(String myString) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        myString = myString.toLowerCase();
        for (char c : myString.toCharArray()) {
            // If the character is already in the map, increment its count
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        return frequencyMap;
    }

    public static void main(String[] args){
        System.out.println("Please input your string: ");
        Scanner sc=new Scanner(System.in);
        String myString=sc.nextLine();
        Map<Character, Integer> frequencyMap = hashMap(myString);

        // Output the character frequencies
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Character: '" + entry.getKey() + "' | Frequency: " + entry.getValue());
        }
    }
}

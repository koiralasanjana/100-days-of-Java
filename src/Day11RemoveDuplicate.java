//Write a program that creates an 'ArrayList' of integers, removes duplicate elements,
// and then prints the unique elements.

import java.util.ArrayList;
import java.util.Arrays;

public class Day11RemoveDuplicate {
    public static void main(String[] args) {
        // Initialize ArrayList with duplicate integers
        ArrayList<Integer> myInt = new ArrayList<>(Arrays.asList(12, 32, 11, 66, 32, 11, 76, 11, 12));
        System.out.println("Original list: " + myInt);

        // Iterate through the list and remove duplicates
        for (int i = 0; i < myInt.size(); i++) {
            for (int j = i + 1; j < myInt.size(); j++) {
                if (myInt.get(i).equals(myInt.get(j))) {
                    myInt.remove(j);
                    j--; // Adjust index after removal
                }
            }
        }

        // Print the list after removing duplicates
        System.out.println("List after removing duplicates: " + myInt);
    }
}

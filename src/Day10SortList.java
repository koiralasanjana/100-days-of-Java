//Write a program that creates an 'ArrayList' of strings, adds some elements to it,
// and then sorts the elements in alphabetical order.

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

public class Day10SortList {
    public static void main(String[] args){
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");

        for (int i = 0; i < colors.size(); i++) {
            for (int j = i + 1; j < colors.size(); j++){
                // Compare the elements at index i and j
                if (colors.get(i).compareTo(colors.get(j)) > 0) {
                    // Swap elements if they are out of order
                    String temp = colors.get(i);
                    colors.set(i, colors.get(j));
                    colors.set(j, temp);
                }
            }
        }
        System.out.println("Sorted Colors: " + colors);

//        Collections.sort(colors);
//        System.out.println(colors);
    }
}

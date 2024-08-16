//Write a program that takes a string input from the user and counts the
// number of vowels in the string

public class Day9VowelCount {
    public void vowel(String input){
        String myInput = input.replaceAll("\\s+","").trim();
//        System.out.println(myInput);
        int count = 0;
        for (int i = 0; i < myInput.length(); i++) {
            if (myInput.charAt(i)=='a'||myInput.charAt(i)=='e'||myInput.charAt(i)=='i'||myInput.charAt(i)=='o'||myInput.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        String input = "This is a test for vowel";
        Day9VowelCount vowel = new Day9VowelCount();
        vowel.vowel(input);
    }
}


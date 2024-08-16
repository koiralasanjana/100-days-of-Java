//Write a program to find the second-largest number in the array of integers.

public class Day8SecondLargestNumber {
    public void testSecondLargest(int[] number){
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if(number[i]>number[j]){
                    int temp;
                    temp = number[i];
                    number[j]=temp;
                    number[i]=number[j];
                }
            }
        }
        System.out.println(number[number.length-2]);
    }
    public static void main(String[] args){
        int[] numbers=new int[]{30,20,60,500,100};
        Day8SecondLargestNumber secondLargestNumber= new Day8SecondLargestNumber();
        secondLargestNumber.testSecondLargest(numbers);
    }
}

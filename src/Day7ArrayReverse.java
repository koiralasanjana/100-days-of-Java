//Write a program to reverse the elements of an array.

public class Day7ArrayReverse {

    public void beforeSwap(int[] myArray){
        System.out.println("Before swap: ");
        for (int i=0; i<5;i++){
            System.out.print(myArray[i]+"  ");
        }
        System.out.println("\n----------------------------");
    }

    public void afterSwap(int[] myArray){
        System.out.println("After swap: ");
        for (int i=4; i>=0;i--){
            System.out.print(myArray[i]+"  ");
        }
    }

    public static void main(String[] args){
        int []myArray = new int[]{10,20,30,40,50};
        Day7ArrayReverse before = new Day7ArrayReverse();
        before.beforeSwap(myArray);
        before.afterSwap(myArray);
    }
}

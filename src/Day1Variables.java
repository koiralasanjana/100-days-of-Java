//. Declare variables of different data types
// (byte, short, int, long, float, double, char, Boolean)
// and initialize them with values. Print these variables to the console.

public class Day1Variables {
    public static void print(){
        int myInt=12;
        byte myByte=127;  //1 byte, smallest integer data type, stores whole numbers from -128 to 127
        short myShort=32000;    //2 bytes, stores whole numbers from -32,768 to 32,767
        float myFloat=25.0f;    //4 bytes, Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double myDouble=99.32;   //8 bytes, Stores fractional numbers. Sufficient for storing 15 decimal digits
        char myChar='A'; //2 bytes, Stores a single character/letter or ASCII values
        boolean myBool=false;

        System.out.println("Integer value: "+myInt);
        System.out.println("Byte value: "+myByte);
        System.out.println("Short value: "+myShort);
        System.out.println("Float value: "+myFloat);
        System.out.println("Double value: "+myDouble);
        System.out.println("Character value: "+myChar);
        System.out.println("boolean value: "+myBool);
    }

    public static void main(String[] args){
        print();
    }
}



//Day-16: Create a base class Animal with a method makeSound() that prints "Animal sound".
// Create a subclass Dog that overrides the makeSound() method to print "Bark".
// Write a program to create an object of Dog and call the makeSound() method.

package Advanced;

public class Animal {
    public void makeSound(){
        System.out.println("Animal Sound");
    }

    public static void main(String[] args){
        Dog dog = new Dog();
        dog.makeSound();
    }
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("bark");
    }
}


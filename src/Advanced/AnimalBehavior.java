//Day-21 Define an interface AnimalBehavior with methods eat() and sleep().
//Create a class Dog that implements AnimalBehavior and provides implementations for eat() and sleep().
//Write a program to create a Dog object and demonstrate its behavior.

package Advanced;

public interface AnimalBehavior {
    public void eat();
    public void sleep();

    public static void main(String[] args){
        Dog2 dog = new Dog2();
        dog.eat();
        dog.sleep();
    }
}

class Dog2 implements AnimalBehavior {
    @Override
    public void eat() {
        System.out.println("Dog food");
    }

    @Override
    public void sleep() {
        System.out.println("Dog bed");
    }
}

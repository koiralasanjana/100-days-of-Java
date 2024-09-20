//Day-14 Create a class 'Laptop' with properties 'brand', 'model' and 'price'.
// Write a method to display the details of the laptop. Create an object and call the method.

package Advanced;

public class Laptop {
    private String brand;
    private String model;
    private Float price;

    public Laptop(String brand, String model, float price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    //getter functions
    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public float getPrice(){
        return price;
    }

    public void printLaptopDetails() {
        System.out.println("Laptop Brand: " + brand);
        System.out.println("Laptop model: " + model);
        System.out.println("Laptop price: " + price);
    }

    public static void main(String[] args){
        Laptop laptop = new Laptop("Dell","53",190008.21f);
        laptop.printLaptopDetails();
    }

}

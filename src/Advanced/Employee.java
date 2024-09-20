//Day-19 Create a base class Employee with properties name, id, and salary.
// Implement a method displayDetails() to print these details.
// Create two subclasses: Manager and Developer.
// The Manager class should have an additional property teamSize, and the Developer class
// should have an additional property programmingLanguage.
// Override the displayDetails() method in both subclasses to include the additional properties.
// Write a program to create objects of both subclasses and display their details.

package Advanced;

public class Employee {
    private String name;
    private int id;
    private float salary;

    public void displayDetails(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public static void main(String[] args){
        Manager manager = new Manager();
        manager.setId(1);
        manager.setName("Alice Yong");
        manager.setSalary(12000.21f);
        manager.setTeamSize(12);
        System.out.println("-------------Manager------------------");
        manager.displayDetails();

        Developer developer = new Developer();
        developer.setId(1);
        developer.setName("Alice Yong");
        developer.setSalary(12000.21f);
        developer.setProgrammingLanguage("Java");
        System.out.println("-------------Developer------------------");
        developer.displayDetails();
    }
}

class Manager extends Employee{
    private int teamSize;

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println(teamSize);
    }
}

class Developer extends Employee{
    private String programmingLanguage;

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println(programmingLanguage);
    }
}
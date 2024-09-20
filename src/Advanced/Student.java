//Day-13 Define a class names 'Student' with properties 'name', 'id' and 'grade'.
// Create an object of the 'Student' class, set its properties, and print them.

package Advanced;

public class Student {
    private String name;
    private int id;
    private double grade;

    //Constructor to initialize properties
    public Student (String name, int id, double grade){
        this.name=name;
        this.id=id;
        this.grade=grade;
    }

    //Getter methods to access properties
    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public double getGrade(){
        return grade;
    }

    //Setter methods to modify properties if needed
    public void setName(String newName){
        name=newName;
    }

    public void setId(String newId){
        name=newId;
    }

    public void setGrade(double newGrade){
        grade=newGrade;
    }

    // Method to print student details
    public void printStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Student Grade: " + grade);
    }

    public static void main(String[] args){
        Student student = new Student("Sanj K",1,99.99);
        student.printStudentDetails();
    }
}

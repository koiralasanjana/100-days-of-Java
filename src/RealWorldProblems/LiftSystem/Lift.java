package RealWorldProblems.LiftSystem;

import java.util.LinkedList;
import java.util.Queue;

public class Lift {
    private int currentFloor=0;
    private int maxCapacity;
    private int currentCapacity;
    private boolean direction;
    private Queue<Integer> floorRequests = new LinkedList<>();

    // Constructor to initialize the lift
    public Lift(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.currentCapacity = 0;
        this.direction = true;
    }

    // Method to move Up
    private void moveUp(){
        currentFloor = currentFloor+1;
        System.out.println("Lift is moving up to floor: "+currentFloor);
        direction = true;
    }

    // Method to move down
    private void moveDown(){
        currentFloor = currentFloor-1;
        System.out.println("Lift is moving down to floor: "+currentFloor);
        direction = false;
    }

    // Request a floor
    public void requestFloor(int floor) {
        if (floor == currentFloor) {
            System.out.println("Already on the requested floor.");
        } else {
            floorRequests.add(floor); // Add the request to the queue
            System.out.println("Floor " + floor + " requested.");
            processRequests(); // Process floor requests
        }
    }

    // Open doors
    public void openDoors() {
        System.out.println("Doors opening at floor: " + currentFloor);
    }

    // Close doors
    public void closeDoors() {
        System.out.println("Doors closing at floor: " + currentFloor);
    }

    // Add a person to the lift
    public void addPerson(int person) {
        if (currentCapacity + person <= maxCapacity) {
            currentCapacity += person;
            System.out.println(person + " person(s) added. Current capacity: " + currentCapacity);
        } else {
            System.out.println("Lift is full. Cannot add more people.");
        }
    }

    // Remove a person from the lift
    public void removePerson(int person) {
        if (currentCapacity >= person) {
            currentCapacity -= person;
            System.out.println(person + " person(s) removed. Current capacity: " + currentCapacity);
        } else {
            System.out.println("Cannot remove more people than present in the lift.");
        }
    }

    // Process floor requests
    public void processRequests() {
        while (!floorRequests.isEmpty()) {
            int requestedFloor = floorRequests.poll();
            while (currentFloor != requestedFloor) {
                if (currentFloor < requestedFloor) {
                    moveUp();
                } else {
                    moveDown();
                }
            }
            openDoors();
            closeDoors();
        }
    }
}

// Building class to manage the Lift
class Building {
    private int floors;
    private Lift lift;

    // Constructor to initialize the building with a certain number of floors and a lift
    public Building(int floors, int liftCapacity) {
        this.floors = floors;
        this.lift = new Lift(liftCapacity);
    }

    // Add a request to the lift
    public void requestLift(int floor) {
        if (floor > 0 && floor <= floors) {
            lift.requestFloor(floor);
        } else {
            System.out.println("Invalid floor request.");
        }
    }

    // Add people to the lift
    public void addPeopleToLift(int numberOfPeople) {
        lift.addPerson(numberOfPeople);
    }

    // Remove people from the lift
    public void removePeopleFromLift(int numberOfPeople) {
        lift.removePerson(numberOfPeople);
    }

    // Method to get the total number of floors in the building
    public int getFloors() {
        return floors;
    }

    // Main method to simulate the building and lift system
    public static void main(String[] args) {
        // Create a building with 10 floors and a lift with capacity of 5 people
        Building building = new Building(10, 7);

        // Simulate lift operations
        building.addPeopleToLift(3);   // Add 3 people to the lift
        building.requestLift(5);       // Request the lift to go to floor 5
        building.removePeopleFromLift(4); // Remove 2 people from the lift
        building.requestLift(2);       // Request the lift to go to floor 2
    }
}

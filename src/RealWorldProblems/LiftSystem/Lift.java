package RealWorldProblems.LiftSystem;

public class Lift {
    private int currentFloor;
    private int maxCapacity;
    private int currentCapacity;
    private boolean direction;

    private int moveUp(){
        return currentFloor+1;
    }

    private int moveDown(){
        return currentFloor-1;
    }

    private void requestFloor(int floor){
        if (!(currentFloor == floor)){
            if (currentFloor>floor){
            }
        }
    }
}

class Building extends Lift {
    private int floors;
    Lift lift = new Lift();
}

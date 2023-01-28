package designpattern.startegy;

public class Vehical {

    DriveStrategy driveStrategy;

    public Vehical(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        this.driveStrategy.drive();
    }
}

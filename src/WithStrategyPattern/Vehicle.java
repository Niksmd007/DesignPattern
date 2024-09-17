package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    //we have created object of interface

    DriveStrategy driveObject;

    //this is known s constructor injection
    public Vehicle(DriveStrategy driveObj) {
        this.driveObject = driveObj;
    }
    public void drive(){
        driveObject.drive();
    }
}

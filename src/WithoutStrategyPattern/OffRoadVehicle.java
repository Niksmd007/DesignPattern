package WithoutStrategyPattern;

public class OffRoadVehicle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("off road vehicle");
    }
}
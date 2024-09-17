import WithStrategyPattern.GoodsVehicle;
import WithStrategyPattern.OffRoadVehicle;
import WithStrategyPattern.SportsVehicle;
import WithStrategyPattern.Vehicle;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("test check");

        Vehicle vehicle=new SportsVehicle();
        vehicle.drive();
        Vehicle vehicle1=new GoodsVehicle();
        vehicle1.drive();
        Vehicle vehicle2=new OffRoadVehicle();
        vehicle2.drive();
    }
}

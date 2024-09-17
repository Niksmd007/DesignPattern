package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;
import WithStrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}

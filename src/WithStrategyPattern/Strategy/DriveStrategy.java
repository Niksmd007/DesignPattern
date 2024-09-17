package WithStrategyPattern.Strategy;

public interface DriveStrategy {
    public void drive();
}


//use case of strategy design pattern is
//if child are having the same code which is not present in base class toh
//we can use strategy design pattern to avoid code duplicate
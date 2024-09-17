package AbstractFactory.abstractFactory;

import AbstractFactory.factory.Car;
import AbstractFactory.factory.EconomicCar1;
import AbstractFactory.factory.EconomicCar2;

public class EconomicCarFactory implements AbstractFactory{
    @Override
    public Car getInstance(int price) {
        if(price>500000&& price<1000000){
            return  new EconomicCar1();
        }
        else if(price>1000000&& price<2000000){
            return  new EconomicCar2();
        }
        return  null;
    }
}

package AbstractFactory;

import AbstractFactory.abstractFactory.AbstractFactory;
import AbstractFactory.abstractFactory.AbstractFactoryProducer;
import AbstractFactory.factory.Car;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractFactoryProducer abstractFactoryProducer=new AbstractFactoryProducer();
        AbstractFactory abstractFactory = abstractFactoryProducer.getFactoryInstance("LUXURY");
        Car car1= abstractFactory.getInstance(2500000);
        int speed1= car1.getSpeed();
        System.out.println(" speed1 : "+speed1);
        AbstractFactory abstractFactory1 = abstractFactoryProducer.getFactoryInstance("ECONOMIC");
        Car car2= abstractFactory1.getInstance(800000);
        int speed2= car2.getSpeed();
        System.out.println(" speed2 : "+speed2);
    }
}

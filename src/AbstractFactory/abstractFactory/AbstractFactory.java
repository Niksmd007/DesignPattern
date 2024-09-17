package AbstractFactory.abstractFactory;

import AbstractFactory.factory.Car;

public interface AbstractFactory {
    public Car getInstance(int price);
}

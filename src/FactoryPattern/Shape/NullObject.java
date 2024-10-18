package FactoryPattern.Shape;

public class NullObject extends  Shape{
    @Override
    public void draw() {
        System.out.println("do nothing ");
    }
}

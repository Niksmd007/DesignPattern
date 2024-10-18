package FactoryPattern.ShapeFactory;

import FactoryPattern.Shape.Circle;
import FactoryPattern.Shape.NullObject;
import FactoryPattern.Shape.Rectangle;
import FactoryPattern.Shape.Shape;

public class ShapeFactory {
    public Shape getShape(String s){
        switch (s){
            case "CIRCLE":
                 return new Circle();
            case "RECTANGLE":
                return  new Rectangle();
            default:
                return  new NullObject(); //null object pattern
        }
    }
}

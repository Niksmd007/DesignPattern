package DecoratorPattern;

import DecoratorPattern.Base.BasePizza;
import DecoratorPattern.Base.FarmHousePizza;
import DecoratorPattern.Base.MargheritaPizza;
import DecoratorPattern.Decorate.ExtraCheese;
import DecoratorPattern.Decorate.Mushroom;

public class Pizza {
    public static void main(String[] args) {
        BasePizza pizza1=new FarmHousePizza();
        BasePizza pizza2=new MargheritaPizza();
        BasePizza pizza3=new ExtraCheese(new FarmHousePizza());
        BasePizza pizza4=new ExtraCheese(new MargheritaPizza());
        BasePizza pizza5=new ExtraCheese(new Mushroom(new FarmHousePizza()));
        BasePizza pizza6=new ExtraCheese(new Mushroom(new MargheritaPizza()));
        BasePizza pizza7=new Mushroom(new FarmHousePizza());
        BasePizza pizza8=new Mushroom(new MargheritaPizza());
        BasePizza pizza9=new Mushroom(new ExtraCheese(new FarmHousePizza()));
        BasePizza pizza10=new Mushroom(new ExtraCheese(new MargheritaPizza()));

        System.out.println("pizza1 price : "+pizza1.cost());
        System.out.println("pizza2 price : "+pizza2.cost());
        System.out.println("pizza3 price : "+pizza3.cost());
        System.out.println("pizza4 price : "+pizza4.cost());
        System.out.println("pizza5 price : "+pizza5.cost());
        System.out.println("pizza6 price : "+pizza6.cost());
        System.out.println("pizza7 price : "+pizza7.cost());
        System.out.println("pizza8 price : "+pizza8.cost());
        System.out.println("pizza9 price : "+pizza9.cost());
        System.out.println("pizza10 price : "+pizza10.cost());

    }
}

package DecoratorPattern.Decorate;

import DecoratorPattern.Base.BasePizza;

public class ExtraCheese extends  ToppingDecorator{
    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+60;
    }
}

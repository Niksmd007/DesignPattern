package AbstractFactory.abstractFactory;

public class AbstractFactoryProducer {
   public AbstractFactory getFactoryInstance(String s){
       switch (s){
           case "LUXURY":
               return  new LuxuryCarFactory();
           case "ECONOMIC":
               return  new EconomicCarFactory();
           default:
               return  null;
       }
   }
}

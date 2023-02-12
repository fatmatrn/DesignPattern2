package CreationalDP.Abstract_FactoryDP;

public class FactoryProducer {
    /*
    Bu class'i runner ile abstract class'i muhattap etmemek icin olusturuyoruz
    FactoryProducer : AbstractFactory  ile iletisimi sagliyor
    Runner -> FactoryProducer'i bilir
    FactoryProducer -> AbstractFactory'yi bilir
    AbstractFactory ->ShapeFactory ve ColorFactory'i bilir,Circle,Square,Red,Green vs bilmez
     */

public static AbstractFactory getFactory(String choice) {//COLOR da gelse SHAPE de gelse AbstractFactory den dallanacagi icin data type bu sekilde yaptik
    if (choice.equalsIgnoreCase("SHAPE")) {
        return new ShapeFactory();
    } else if (choice.equalsIgnoreCase("COLOR")) {
        return new ColorFactory();
    }
    return null;
}
}

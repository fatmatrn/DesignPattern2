package CreationalDP.Abstract_FactoryDP;

public abstract  class AbstractFactory {
/*
AbstractFactory:Factory lerin factory si olarak dusunebilliriz
 */

    abstract Color getColor(String color);

    abstract Shape getShape(String shape);

}

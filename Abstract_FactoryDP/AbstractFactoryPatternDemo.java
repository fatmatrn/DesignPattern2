package CreationalDP.Abstract_FactoryDP;

public class AbstractFactoryPatternDemo {
    //Runner classs FactoryProducer uzerinden tum yapiya ulasabiliyor.
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");//getFactory() satatic oldugu icin direkt class ismi ile cagirdik
        Shape shape1 =shapeFactory.getShape("DAİRE");
        shape1.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color1 = colorFactory.getColor("RED");
        color1.fill();
    }
}

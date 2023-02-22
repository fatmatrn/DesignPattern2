package CreationalDP.FactoryDP;

public class ShapeFactory {

    public Shape getShape(String shapeType) {//Burada data type'na Shape yazdigimiz da Circle,rectangle ve Square nin ucunude karsiliyor.
                                            //Boylece method daha fonksiyonel hale geliyor
        if(shapeType==null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("DAİRE")) {
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("DİKDORTGEN")) {
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("KARE")) {
            return new Square();
        }
        return null;
    }
}

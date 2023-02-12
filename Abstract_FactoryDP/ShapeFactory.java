package CreationalDP.Abstract_FactoryDP;



public class ShapeFactory extends AbstractFactory{

    @Override
    Color getColor(String color) {
        return null;
    }//abstract method oldugundan mecburen override ettik
                                                 //ShapeFactory , color uretmeyecegi icin null'a cektik

   public Shape getShape(String shapeType) {
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

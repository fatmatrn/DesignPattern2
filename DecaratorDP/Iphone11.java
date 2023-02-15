package StructuralDP.DecaratorDP;

public class Iphone11 extends PhoneDecarator{

    public Iphone11(IPhone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName()+"11";  //Iphone11
    }
}

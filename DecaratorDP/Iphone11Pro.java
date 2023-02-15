package StructuralDP.DecaratorDP;

public class Iphone11Pro extends PhoneDecarator{

    public Iphone11Pro(IPhone basicPhone) {
        super(basicPhone);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+500;
    }

    @Override
    public String getName() {
        return super.getName()+" 11 Pro";
    }

    @Override
    public int cameraCount() {
        return super.cameraCount()+1;
    }
}

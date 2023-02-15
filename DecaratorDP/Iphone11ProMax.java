package StructuralDP.DecaratorDP;

public class Iphone11ProMax extends Iphone11Pro{

    public Iphone11ProMax(IPhone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName()+"Max";//11Pro Max
    }

    @Override
    public double getPrice() {
        return super.getPrice()+1000;
    }

    //kamera sayisi ayni diye override etmiyoruz

    public String extraMethod(){
        return "Gold Renk";
    }
}

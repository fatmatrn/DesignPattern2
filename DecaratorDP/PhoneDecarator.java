package StructuralDP.DecaratorDP;

public class PhoneDecarator implements Phone{

    protected Phone basicPhone;

    //***************Const.


    public PhoneDecarator(IPhone basicPhone) {
        this.basicPhone = basicPhone;
    }

    @Override
    public String getName() {
        return basicPhone.getName();
    }

    @Override
    public int cameraCount() {
        return basicPhone.cameraCount();
    }

    @Override
    public double getPrice() {
        return basicPhone.getPrice();
    }
}

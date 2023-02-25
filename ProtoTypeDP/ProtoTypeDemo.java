package CreationalDP.ProtoTypeDP;

public class ProtoTypeDemo {
    public static void main(String[] args) {
        Soldier availableSoilder = new Soldier(100,45,20,
                50,60,5,"Kilic",true);
        Soldier notAvailableSoilder1 = new Soldier(100,45,20,
                50,60,5,"Kilic",false);

Soldier notAvailableSoilder2 = availableSoilder.clone();//Obje klonlandi
        notAvailableSoilder2.setAvailableForWar(false);

        System.out.println("*********************************************");
        System.out.println("notAvailableSoilder1 icin cikti ");
        notAvailableSoilder1.showSoldierInfo();
        System.out.println("notAvailableSoilder2 icin cikti ");
        notAvailableSoilder2.showSoldierInfo();


    }
}

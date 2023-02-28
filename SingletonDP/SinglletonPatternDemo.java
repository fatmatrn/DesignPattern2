package CreationalDP.SingletonDP;

public class SinglletonPatternDemo {
    public static void main(String[] args) {
        //SingletonObject object1 = new SingletonObject();
       // SingletonObject object2 = new SingletonObject();//Bu ikisi hata verdi cunku consructor u private yapmistik

        SingletonObject object1 =SingletonObject.getInstance();//New'lemeden obje olusturduk
        System.out.println("object1 icin changeMessage() cagirilmadan once -> "+object1.message);//MERHABA
        object1.changeMessage();  //MERHABA Batch 104-105-114
        System.out.println("object1 icin :"+object1.message);


        SingletonObject object2 =SingletonObject.getInstance();
        System.out.println("object2 icin : "+object2.message);//MERHABA Batch 104-105-114

        //object1 ve object2 nin ayni oldugunu gorduk.Demek ki singleton obje uretebildik.
        //Sonuc olarak; kendimiz bir obje urettik , baskalarinin yeni obje uretmesini engelledik
        //Isteyene hep ayni numuneyi yolladik.Spring Framework teki bean mantigi da yani dir.

        /*
        !!!Interview Question: Bir Constructor'u private'e niye cekeriz??
        CEVAP:Singleton Design Pattern
         */


    }
}

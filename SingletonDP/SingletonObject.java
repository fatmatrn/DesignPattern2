package CreationalDP.SingletonDP;

public class SingletonObject {
/*
Singleton:Eger bir objeyi new’ledikten sonra runner tarafinda her seferinde ayni objenin
gelmesini istediğimiz durumlarda kullanilir
 */
    String message = "MERHABA";

    private static  SingletonObject instance = new SingletonObject();//Tek seferlik burada creat ettik.
    //static ile denedik fakat bu runner de new  lememize engel olamiyor.



    private SingletonObject(){};//Baska class lardan erisimi engelleyerek new'lemeye
                                // izin vermemis oluyoruz(SingletonDesignPattern'i saglamak icin)


    public static SingletonObject getInstance(){//Methodu static yaparak objesiz bir sekilde ulasimi sagliyoruz
        return instance;   //instance private oldugundan sadece ayni class ta kullanabiliyoruz.
                           //method ta public ve static olunca baska class tan new leme yapmadan bu objeyi cagirmis oluyoruz
    }

    public void changeMessage(){//Bu method u amacimiza ulastikmi diye gorebilmek icin olusturduk
        this.message=this.message+" Batch 104-105-114";
    }

}

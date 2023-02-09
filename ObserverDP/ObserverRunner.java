package BehavioralDP.ObserverDP;

public class ObserverRunner {
    public static void main(String[] args) {
        ObserverRunner observer = new ObserverRunner();
        observer.observerdemo();
    }

    void observerdemo(){
        Channel channel1 = new NewsChannel();
        Channel channel2 = new NewsChannel();
        Channel channel3 = new NewsChannel();

        NewsAgency agency = new NewsAgency();
        agency.addObserves(channel1);
        agency.addObserves(channel2);
        agency.addObserves(channel3);

        agency.sendNews("Java dili artik TechPro ile cok daha kolay");
        agency.sendNews("SpringBoot artik  kolay");
        agency.sendNews("Spring Security sac beyazlatir");

        System.out.println("Channel 1 Haberler : ");
        channel1.printNews();
        System.out.println("*******************************");
        System.out.println("Channel 2 Haberler : ");
        channel2.printNews();
        System.out.println("*******************************");
        System.out.println("Channel 3 Haberler : ");
        channel3.printNews();
        System.out.println("*******************************");


    }
}

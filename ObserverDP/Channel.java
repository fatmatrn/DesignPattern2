package BehavioralDP.ObserverDP;

public interface Channel {
    void update(String news);//yeni haber eklemek icin
    void printNews();
}

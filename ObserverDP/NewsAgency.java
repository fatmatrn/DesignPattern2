package BehavioralDP.ObserverDP;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    private String news;

    private List<Channel>  channels = new ArrayList<>();

    public void addObserves(Channel channel){
        this.channels.add(channel);
    }

    public void removeObserves(Channel channel){
        this.channels.remove(channel);
    }

    public void sendNews(String news){
        this.news=news;
        for (Channel channel : this.channels){
            channel.update(this.news);
        }
    }
}

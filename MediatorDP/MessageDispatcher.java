package BehavioralDP.MediatorDP;

import java.util.HashMap;
import java.util.Map;

public class MessageDispatcher implements Dispatcher {

    Map<String, Actor> registerActors = new HashMap<>();

    void register(String topic, Actor actor) {
        registerActors.put(topic, actor);
    }

    @Override
    public void dispatch(String topic, String message) {
        Actor actor = registerActors.get(topic);

        if (actor == null) {
            System.out.println("No actor registered for this topic");
        } else {
            actor.receiveMessage(message);
        }
    }
}

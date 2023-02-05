package BehavioralDP.MediatorDP;

public class MediatorRunner {

        public static void main(String[] args) {
            MediatorRunner mediator = new MediatorRunner();
            mediator.mediatorDemo();

        }


        void mediatorDemo(){
            MessageDispatcher dispatcher = new MessageDispatcher();

            Actor actor1 = new MessageActor("Actor 1", dispatcher);
            Actor actor2 = new MessageActor("Actor 2", dispatcher);
            Actor actor3 = new MessageActor("Actor 3", dispatcher);
            Actor actor4 = new MessageActor("Actor 4", dispatcher);

            dispatcher.register("topic1", actor1);
            dispatcher.register("topic2", actor2);
            dispatcher.register("topic3", actor3);
            dispatcher.register("topic4", actor4);

            actor1.sendMessage("topic2", "Message for topic 2");
            actor1.sendMessage("topic3", "Message for topic 3");
            actor1.sendMessage("topic4", "Message for topic 4");
        }
    }

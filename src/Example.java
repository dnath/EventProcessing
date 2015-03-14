import core.EventDispatcher;
import core.Event;
import core.Handler;

public class Example {
    public static void main(String[] args) {
        EventDispatcher eventDispatcher = new EventDispatcher();
        eventDispatcher.registerChannel(Event.class, new Handler());

        eventDispatcher.dispatch(new Event());
    }
}

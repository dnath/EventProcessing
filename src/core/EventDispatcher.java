package core;

import core.framework.Channel;
import core.framework.DynamicRouter;

import java.util.HashMap;
import java.util.Map;

public class EventDispatcher implements DynamicRouter<Event> {
    private Map<Class<? extends Event>, Handler> handlers;

    public EventDispatcher() {
        this.handlers = new HashMap<Class<? extends Event>, Handler>();
    }

    @Override
    public void registerChannel(Class<? extends Event> messageType, Channel<? extends Event> channel) {
        this.handlers.put(messageType, (Handler)channel);
    }

    @Override
    public void dispatch(Event event) {
        this.handlers.get(event.getClass()).dispatch(event);
    }
}

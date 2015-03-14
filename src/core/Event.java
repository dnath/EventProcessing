package core;


import core.framework.Message;

public class Event implements Message {
    @Override
    public Class<? extends Message> getType() {
        return this.getClass();
    }
}

package core.framework;

public interface DynamicRouter<E extends Message> {
    public void registerChannel(Class<? extends E> messageType,
                                Channel<? extends E> channel);
    public abstract void dispatch(E message);
}

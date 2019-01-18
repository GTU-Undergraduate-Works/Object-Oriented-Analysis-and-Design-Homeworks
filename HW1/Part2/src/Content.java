import java.util.ArrayList;

public abstract class Content  {


    ArrayList<Subscriber> subscribers;
    protected boolean changed = false;

    public synchronized void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public synchronized void deleteSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public synchronized void deleteSubscribers() {
        subscribers.clear();
    }


    public void notifyObservers(Object arg) {

        if (changed) {
            for (int i = 0; i < subscribers.size(); ++i)
                subscribers.get(i).update(this, arg);
        }
    }

    public void contentChanged(Object arg) {
        setChanged();
        notifyObservers(arg);
    }

    protected abstract void setChanged();


}

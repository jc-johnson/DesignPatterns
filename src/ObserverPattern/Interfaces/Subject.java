package ObserverPattern.Interfaces;

/**
 * Created by Jordan on 5/27/2016.
 */
public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}

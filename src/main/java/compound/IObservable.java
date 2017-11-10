package compound;

/**
 * @author zeyu 2017/11/10
 */
public interface IObservable<E> {
    void addObserver(IObserver<E> observer);

    void removeObserver(IObserver<E> observer);

    void notifyObserver(E e);
}

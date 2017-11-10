package compound;

/**
 * @author zeyu 2017/11/10
 */
public interface IObserver<E> {
    void update(E e);
}

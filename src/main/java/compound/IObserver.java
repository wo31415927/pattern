package compound;

/**
 * <p>实际场景中并不适用,因为观察者接口往往具有很多方法
 * @author zeyu 2017/11/10
 */
public interface IObserver<E> {
    void update(E e);
}

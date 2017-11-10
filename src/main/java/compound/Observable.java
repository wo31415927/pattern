package compound;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author zeyu 2017/11/10
 */
public class Observable<E> implements IObservable<E> {
    protected List<IObserver<E>> list = Lists.newArrayList();

    @Override
    public void addObserver(IObserver<E> observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(IObserver<E> observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver(E e) {
        for(IObserver<E> observer : list){
            observer.update(e);
        }
    }
}

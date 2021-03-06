package compound;

/**
 * @author zeyu 2017/11/10
 */
public abstract class AbstractDuck implements IDuck{
    protected IObservable<IDuck> observable = new Observable<>();

    @Override
    public void addObserver(IObserver<IDuck> observer) {
        observable.addObserver(observer);
    }

    @Override
    public void removeObserver(IObserver<IDuck> observer) {
        observable.removeObserver(observer);
    }

    /**
     * TODO 怎样设成protected,不要暴露给外部调用
     */
    @Override
    public void notifyObserver(IDuck duck) {
        observable.notifyObserver(duck);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}

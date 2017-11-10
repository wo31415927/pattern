package compound;

import lombok.RequiredArgsConstructor;

/**
 * @author zeyu 2017/11/10
 */
@RequiredArgsConstructor
public class CountDuck implements IDuck {
    public static int quackCnt = 0;
    /**
     * 装饰
     */
    protected final IDuck duck;

    @Override
    public void quack() {
        duck.quack();
        quackCnt++;
    }

    @Override
    public void addObserver(IObserver observer) {
        duck.addObserver(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        duck.removeObserver(observer);
    }

    @Override
    public void notifyObserver(IDuck iduck) {
        throw new UnsupportedOperationException();
    }
}

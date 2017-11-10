package compound;

/**
 * @author zeyu 2017/11/10
 */
public interface IDuck extends IObservable<IDuck>{
    /**
     * 鸣叫
     */
    void quack();
}

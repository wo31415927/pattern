package compound;

/**
 * @author zeyu
 * 2017/11/10
 */
public class RedDuck extends AbstractDuck {
    @Override
    public void quack() {
        System.out.println("Quack!");
        notifyObserver(this);
    }
}

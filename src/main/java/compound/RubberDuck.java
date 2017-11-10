package compound;

/**
 * @author zeyu 2017/11/10
 */
public class RubberDuck extends AbstractDuck {
    @Override
    public void quack() {
        System.out.println("Chichi!");
        notifyObserver(this);
    }
}

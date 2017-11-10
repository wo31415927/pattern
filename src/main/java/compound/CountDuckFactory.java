package compound;

/**
 * @author zeyu 2017/11/10
 */
public class CountDuckFactory extends AbstractDuckFactory {
    @Override
    public IDuck createRedDuck() {
        return new CountDuck(new RedDuck());
    }

    @Override
    public IDuck createRubberDuck() {
        return new CountDuck(new RubberDuck());
    }
}

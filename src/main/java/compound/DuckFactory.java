package compound;

/**
 * @author zeyu 2017/11/10
 */
public class DuckFactory extends AbstractDuckFactory {
    @Override
    public IDuck createRedDuck() {
        return new RedDuck();
    }

    @Override
    public IDuck createRubberDuck() {
        return new RubberDuck();
    }
}

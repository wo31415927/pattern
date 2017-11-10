package compound;

/**
 * @author zeyu 2017/11/10
 */
public class DuckScholar implements IObserver<IDuck> {
    @Override
    public void update(IDuck duck) {
        System.out.println(this.getClass().getSimpleName() + " found " + duck + " quack!");
    }
}

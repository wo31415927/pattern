package compound;

/**
 * @author zeyu 2017/11/10
 */
public class GooseScholar implements IObserver<Goose>{
    @Override
    public void update(Goose goose) {
        System.out.println(goose);
    }
}

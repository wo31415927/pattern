package compound;

import Dic.MyDic;

/**
 * @author zeyu 2017/11/10
 */
public class Client {
    public static void main(String[] args) {
        IDuckFactory duckFactory = new CountDuckFactory();
        IDuck duck = duckFactory.create(MyDic.DuckType.RED);
        /*
        duck.addObserver(new DuckScholar());
        duck.quack();
        duckFactory = new DuckFactory();
        duck = duckFactory.create(MyDic.DuckType.RUBBER);
        AbstractDuck duck1 = (AbstractDuck)duck;*/
        GooseScholar gooseScholar = new GooseScholar();
        /*duck1.addObserver(gooseScholar);
        duck1.quack();*/
        /* 模拟cast异常
        List<IObserver> l = new ArrayList<>();
        l.add(new GooseScholar());
        l.get(0).update(duck);*/
    }


}

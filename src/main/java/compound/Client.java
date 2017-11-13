package compound;

import Dic.MyDic;

/** @author zeyu 2017/11/10 */
public class Client {
  public static void main(String[] args) {
    /* 模拟Observable.addObserver()不声明泛型类型造成的cast异常
    List<IObserver> l = new ArrayList<>();
    l.add(new GooseScholar());
    l.get(0).update(duck);*/
    DuckScholar duckScholar = new DuckScholar();
    IDuckFactory duckFactory = new CountDuckFactory();
    IDuck duck = duckFactory.create(MyDic.DuckType.RED);
    duck.addObserver(duckScholar);
    duck.quack();
    duckFactory = new DuckFactory();
    duck = duckFactory.create(MyDic.DuckType.RUBBER);
    duck.addObserver(duckScholar);
    duck.quack();
  }
}

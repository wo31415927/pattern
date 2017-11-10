package compound;

import Dic.MyDic;

/**
 * @author zeyu 2017/11/10
 */
public interface IDuckFactory {
    IDuck create(MyDic.DuckType duckType);

    IDuck createRedDuck();

    IDuck createRubberDuck();
}

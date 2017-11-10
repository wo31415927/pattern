package compound;

import Dic.MyDic;

/**
 * 抽象工厂
 * @author zeyu 2017/11/10
 */
public abstract class AbstractDuckFactory implements IDuckFactory{
    /**
     * 简单工厂入口
     * @param duckType
     * @return
     */
    @Override
    public IDuck create(MyDic.DuckType duckType) {
        switch (duckType) {
            case RED:
                return createRedDuck();
            case RUBBER:
                return createRubberDuck();
            default:
                return null;
        }
    }


}

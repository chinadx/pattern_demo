package cn.goodman.pattern.factorymethod;

/**
 * Created by Shaun on 2017/2/8.
 */
public class MarineFactory implements IInfantryFactory {
    public Infantry createInfantry() {
        return new Marine();
    }
}

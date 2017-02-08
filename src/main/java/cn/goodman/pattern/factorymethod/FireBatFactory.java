package cn.goodman.pattern.factorymethod;

/**
 * Created by Shaun on 2017/2/8.
 */
public class FireBatFactory implements IInfantryFactory {
    public Infantry createInfantry() {
        return new FireBat();
    }
}

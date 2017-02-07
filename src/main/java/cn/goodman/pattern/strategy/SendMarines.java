package cn.goodman.pattern.strategy;

/**
 * Created by Shaun on 2017/2/7.
 */
public class SendMarines implements IStrategy {

    public void attack() {
        System.out.println("机枪兵出动！别催我！");
    }
}

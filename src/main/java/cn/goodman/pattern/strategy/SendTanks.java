package cn.goodman.pattern.strategy;

/**
 * Created by Shaun on 2017/2/7.
 */
public class SendTanks implements IStrategy {
    public void attack() {
        System.out.println("坦克兵出动！踏平四海！");
    }
}

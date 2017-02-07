package cn.goodman.pattern.strategy;

/**
 * Created by Shaun on 2017/2/7.
 */
public class SendZealots implements IStrategy {
    public void attack() {
        System.out.println("狂徒出击！我们是艾尔的利刃！");
    }
}

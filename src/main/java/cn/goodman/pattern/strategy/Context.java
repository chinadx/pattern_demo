package cn.goodman.pattern.strategy;

/**
 * Created by Shaun on 2017/2/7.
 */
public class Context {
    private IStrategy strategy;

    /**
     * 构造函数
     * @param strategy
     */
    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 攻击啊
     */
    public void attack() {
        this.strategy.attack();
    }
}

package cn.goodman.pattern.strategy;

/**
 * Created by Shaun on 2017/2/7.
 */
public class Player {
    public static void main(String[] args) {
        Context context;
        /**
         * 先派机枪兵出去探探路
         */
        context = new Context(new SendMarines());
        context.attack();

        /**
         * 派狂徒出去砍他
         */
        context = new Context(new SendZealots());
        context.attack();

        /**
         * 坦克炸平
         */
        context = new Context(new SendTanks());
        context.attack();
    }
}

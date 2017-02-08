package cn.goodman.pattern.factorymethod;

/**
 * Created by Shaun on 2017/2/8.
 */
public class Marine extends Infantry {
    public void run() {
        System.out.println("机枪兵前进");
    }

    public void attack() {
        System.out.println("机枪兵扫射");
    }
}

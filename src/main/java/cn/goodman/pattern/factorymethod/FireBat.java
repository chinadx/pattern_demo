package cn.goodman.pattern.factorymethod;

/**
 * Created by Shaun on 2017/2/8.
 */
public class FireBat extends Infantry {
    public void run() {
        System.out.println("火蝠前进");
    }

    public void attack() {
        System.out.println("火蝠喷火");
    }
}

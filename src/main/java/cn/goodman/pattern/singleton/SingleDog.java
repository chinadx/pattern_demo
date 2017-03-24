package cn.goodman.pattern.singleton;

/**
 * Created by Shaun on 2017/3/24.
 */
public class SingleDog {
    private static final SingleDog ourInstance = new SingleDog();

    public static SingleDog getInstance() {
        return ourInstance;
    }

    private SingleDog() {
    }
}

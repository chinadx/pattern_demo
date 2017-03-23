package cn.goodman.pattern.factorymethod;

/**
 * Created by Shaun on 2017/3/23.
 */
public class Tank extends Vehicle {
    public void wheel() {
        System.out.println("I have wheels, I'm best.");
    }

    public void fire() {
        System.out.println("Fire in the hole!...");
    }
}

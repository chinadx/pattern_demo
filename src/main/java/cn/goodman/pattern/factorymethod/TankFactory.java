package cn.goodman.pattern.factorymethod;

/**
 * Created by Shaun on 2017/3/23.
 */
public class TankFactory implements IVehicleFactory {
    public Vehicle createVehicle() {
        return new Tank();
    }
}

package com.yan.design.mode.factory.abst.demo1;

/**
 * @author : 楠GG
 * @date : 2017/11/25 22:20
 * @description : TODO
 */
public class Q7Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new SUVTire();
    }

    @Override
    public IEngine createEngine() {
        return new ImportEngine();
    }

    @Override
    public IBrake createBrake() {
        return new SeniorBrake();
    }
}

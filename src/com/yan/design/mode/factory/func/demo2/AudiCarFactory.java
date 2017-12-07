package com.yan.design.mode.factory.func.demo2;

/**
 * @author : 楠GG
 * @date : 2017/11/21 22:01
 * @description : 奥迪汽车具体生产工厂
 */
public class AudiCarFactory extends AudiFactory {
    @Override
    public <T extends AudiCar> T createAudiCar(Class<T> clz) {
        AudiCar car = null;
        try {
            car = ((AudiCar) Class.forName(clz.getName()).newInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) car;
    }
}

package com.yan.design.mode.factory.func.demo1;

/**
 * @author : 楠GG
 * @date : 2017/11/19 0:06
 * @description : TODO
 */
public class ConcreteFactory2 extends Factory2 {
    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        Product product = null;
        try {
            product = ((Product) Class.forName(clz.getName()).newInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}

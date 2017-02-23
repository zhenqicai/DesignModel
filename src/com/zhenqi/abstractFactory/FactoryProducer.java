package com.zhenqi.abstractFactory;

/**
 * Created by jo on 2017/2/22.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        if("color".equalsIgnoreCase(choice))
            return new ColorFactory();
        if("shape".equalsIgnoreCase(choice))
            return new ShapeFactory();
        return null;
    }
}

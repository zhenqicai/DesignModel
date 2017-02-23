package com.zhenqi.abstractFactory;

/**
 * Created by jo on 2017/2/22.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        if(null == color){
            return null;
        }
        if(color.equalsIgnoreCase("red")){
            return new Red();
        } else if(color.equalsIgnoreCase("green")){
            return new Green();
        } else if(color.equalsIgnoreCase("blue")){
            return new Blue();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}

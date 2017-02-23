package com.zhenqi.abstractFactory;

/**
 * Created by jo on 2017/2/22.
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shareType) {
        if(null==shareType)
            return null;
        if("circle".equalsIgnoreCase(shareType))
            return new Circle();
        if("rectangle".equalsIgnoreCase(shareType))
            return new Rectangle();
        if("square".equalsIgnoreCase(shareType))
            return new Square();
        return null;
    }
}

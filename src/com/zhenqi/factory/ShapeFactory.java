package com.zhenqi.factory;

/**
 * Created by jo on 2017/2/22.
 */
public class ShapeFactory {

    public Share getShare(String shareType){
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

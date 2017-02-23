package com.zhenqi.factory;

/**
 * Created by jo on 2017/2/22.
 */
public class FactoryPatternDemo {

    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Share share=shapeFactory.getShare("circle");
        share.draw();

        Share share2=shapeFactory.getShare("rectangle");
        share2.draw();

        Share share3=shapeFactory.getShare("square");
        share3.draw();
    }
}

package com.zhenqi.abstractFactory;

/**
 * Created by jo on 2017/2/22.
 */
public abstract class AbstractFactory {

    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}

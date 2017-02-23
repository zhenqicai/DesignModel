package com.zhenqi.abstractFactory;

/**
 * Created by jo on 2017/2/22.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

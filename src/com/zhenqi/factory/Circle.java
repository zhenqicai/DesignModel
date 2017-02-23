package com.zhenqi.factory;

/**
 * Created by jo on 2017/2/22.
 */
public class Circle implements Share {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

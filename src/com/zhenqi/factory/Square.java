package com.zhenqi.factory;

/**
 * Created by jo on 2017/2/22.
 */
public class Square implements Share {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

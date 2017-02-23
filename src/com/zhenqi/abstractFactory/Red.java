package com.zhenqi.abstractFactory;

/**
 * Created by jo on 2017/2/22.
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}

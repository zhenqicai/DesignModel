package com.zhenqi.abstractFactory;

/**
 * Created by jo on 2017/2/22.
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}

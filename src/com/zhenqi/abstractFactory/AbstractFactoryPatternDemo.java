package com.zhenqi.abstractFactory;

/**
 * Created by jo on 2017/2/22.
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args){
        //��ȡ��״����
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");

        //��ȡ��״Ϊ Circle �Ķ���
        Shape shape1 = shapeFactory.getShape("circle");

        //���� Circle �� draw ����
        shape1.draw();

        //��ȡ��״Ϊ Rectangle �Ķ���
        Shape shape2 = shapeFactory.getShape("rectangle");

        //���� Rectangle �� draw ����
        shape2.draw();

        //��ȡ��״Ϊ Square �Ķ���
        Shape shape3 = shapeFactory.getShape("square");

        //���� Square �� draw ����
        shape3.draw();

        //��ȡ��ɫ����
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");

        //��ȡ��ɫΪ Red �Ķ���
        Color color1 = colorFactory.getColor("red");

        //���� Red �� fill ����
        color1.fill();

        //��ȡ��ɫΪ Green �Ķ���
        Color color2 = colorFactory.getColor("green");

        //���� Green �� fill ����
        color2.fill();

        //��ȡ��ɫΪ Blue �Ķ���
        Color color3 = colorFactory.getColor("blue");

        //���� Blue �� fill ����
        color3.fill();
    }
}

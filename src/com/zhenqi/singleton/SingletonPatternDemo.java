package com.zhenqi.singleton;

/**
 * Created by jo on 2017/2/22.
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {

        //���Ϸ��Ĺ��캯��
        //����ʱ���󣺹��캯�� SingleObject() �ǲ��ɼ���
        //SingleObject object = new SingleObject();
        //��ȡΨһ���õĶ���
        SingleObject object = SingleObject.getInstance();

        //��ʾ��Ϣ
        object.showMessage();
    }
}

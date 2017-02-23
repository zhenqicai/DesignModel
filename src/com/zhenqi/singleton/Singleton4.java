package com.zhenqi.singleton;

/**
 * Created by jo on 2017/2/22.
 * ˫����/˫��У������DCL���� double-checked locking��
 * JDK �汾��JDK1.5 ��
 * �Ƿ� Lazy ��ʼ������
 * �Ƿ���̰߳�ȫ����
 * ʵ���Ѷȣ��ϸ���
 * ���������ַ�ʽ����˫�����ƣ���ȫ���ڶ��߳�������ܱ��ָ����ܡ�
 * getInstance() �����ܶ�Ӧ�ó���ܹؼ���
 */
public class Singleton4 {

    private volatile static Singleton4 singleton;
    private Singleton4 (){}
    public static Singleton4 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton4.class) {
                if (singleton == null) {
                    singleton = new Singleton4();
                }
            }
        }
        return singleton;
    }
}

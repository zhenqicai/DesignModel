package com.zhenqi.singleton;

/**
 * Created by jo on 2017/2/22.
 * ����ʽ���̲߳���ȫ
 * �Ƿ� Lazy ��ʼ������
 * �Ƿ���̰߳�ȫ����
 * ʵ���Ѷȣ���
 * ���������ַ�ʽ���������ʵ�ַ�ʽ������ʵ������������ǲ�֧�ֶ��̡߳���Ϊû�м��� synchronized��
 *       �����ϸ��������������㵥��ģʽ��
 * ���ַ�ʽ lazy loading �����ԣ���Ҫ���̰߳�ȫ���ڶ��̲߳�������������
 */
public class Singleton {

    private static Singleton instance;
    private Singleton (){}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

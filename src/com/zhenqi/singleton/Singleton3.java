package com.zhenqi.singleton;

/**
 * Created by jo on 2017/2/22.
 * ����ʽ
 * �Ƿ� Lazy ��ʼ������
 * �Ƿ���̰߳�ȫ����
 * ʵ���Ѷȣ���
 * ���������ַ�ʽ�Ƚϳ��ã������ײ�����������
 * �ŵ㣺û�м�����ִ��Ч�ʻ���ߡ�
 * ȱ�㣺�����ʱ�ͳ�ʼ�����˷��ڴ档
 * ������ classloder ���Ʊ����˶��̵߳�ͬ�����⣬������instance ����װ��ʱ��ʵ��������Ȼ������װ�ص�ԭ���кܶ��֣�
 * �ڵ���ģʽ�д�������ǵ��� getInstance ������ ����Ҳ����ȷ���������ķ�ʽ�����������ľ�̬������������װ�أ�
 * ��ʱ���ʼ�� instance ��Ȼû�дﵽ lazy loading ��Ч����
 */
public class Singleton3 {

    private static Singleton3 instance = new Singleton3();
    private Singleton3 (){}
    public static Singleton3 getInstance() {
        return instance;
    }
}

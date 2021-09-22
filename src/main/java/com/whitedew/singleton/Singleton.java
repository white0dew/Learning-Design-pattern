package com.whitedew.singleton;

/**
 * @Author whitedew
 * @Date 2021/5/25 22:23
 */

//单例模式：饿汉模式，使用静态类成员变量
public class Singleton {
    //创建 Singleton 的一个对象
    private static final Singleton singleton = new Singleton();

    //让构造函数为 private，这样该类就不会被实例化
    private Singleton() {
    }

    //可以通过该API获取唯一可用的对象
    public static Singleton getInstance() {
        return singleton;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}

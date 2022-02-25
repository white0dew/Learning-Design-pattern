package com.whitedew.singleton;

/**
 * @Author whitedew
 * @Date 2021/5/25 22:23
 */

//单例模式：懒汉模式，但是线程不安全
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {
    }

    //需要的时候再创建对应的实例
    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}

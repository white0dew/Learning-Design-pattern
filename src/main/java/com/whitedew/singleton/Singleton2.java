package com.whitedew.singleton;

/**
 * @Author whitedew
 * @Date 2021/5/25 22:23
 */

//单例模式：懒汉模式，双重检查锁
public class Singleton2 {
    private volatile static Singleton2 singleton;

    private Singleton2() {
    }

    //采用双检查锁，避免频繁加锁，性能较好
    public static Singleton2 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton2.class) {
                if (singleton == null) {
                    singleton = new Singleton2();
                }
            }
        }
        return singleton;
    }
}

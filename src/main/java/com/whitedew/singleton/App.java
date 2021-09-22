package com.whitedew.singleton;

/**
 * @Author whitedew
 * @Date 2021/5/25 22:23
 */
public class App {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();


        if (instance1 == instance2) {
            System.out.println("同一个实例");
        }
    }
}

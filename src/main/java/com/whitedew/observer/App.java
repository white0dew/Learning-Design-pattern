package com.whitedew.observer;

/**
 * @Author whitedew
 * @Date 2021/8/8 15:28
 */
public class App {
    public static void main(String[] args) {
        // 前台为通知者
        Xiaohuang xiaohuang = new Xiaohuang();

        Xiaohong observer1 = new Xiaohong("小红", xiaohuang);
        Xiaolv observer2 = new Xiaolv("小绿", xiaohuang);
        Xiaolan observer3 = new Xiaolan("小蓝", xiaohuang);

        // 需要通知三个
        xiaohuang.attach(observer1);
        xiaohuang.attach(observer2);
        xiaohuang.attach(observer3);

        // 设置通知状态
        xiaohuang.setAction("小心！Boss回来了！");
        // 发送通知
        xiaohuang.notifyObservers();
    }

}

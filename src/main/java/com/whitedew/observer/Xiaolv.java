package com.whitedew.observer;

/**
 * @Author whitedew
 * @Date 2021/8/8 15:26
 */
public class Xiaolv extends Observer {
    public Xiaolv(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getAction() + "\n" + name + "把游戏机收起来！继续学习！");
    }
}

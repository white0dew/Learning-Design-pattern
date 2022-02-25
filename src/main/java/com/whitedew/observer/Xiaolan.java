package com.whitedew.observer;

/**
 * @Author whitedew
 * @Date 2021/8/8 15:25
 */
public class Xiaolan extends Observer {
    public Xiaolan(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getAction() + "\n" + name + "把手机收起来！继续学习！");
    }
}

package com.whitedew.observer;

/**
 * @Author whitedew
 * @Date 2021/8/8 15:24
 */
public class Xiaohong extends Observer {

    public Xiaohong(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getAction() + "\n" + name + "把小说藏起来！继续学习！");
    }

}

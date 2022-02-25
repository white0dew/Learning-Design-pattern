package com.whitedew.observer;

/**
 * @Author whitedew
 * @Date 2021/8/8 15:01
 */
public abstract class Observer {

    protected String name;
    protected Subject subject;

    public Observer(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public abstract void update();

}

package com.whitedew.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author whitedew
 * @Date 2021/8/8 15:20
 */
public class Xiaohuang implements Subject {

    // 需要通知的同学列表
    private final List<Observer> observers = new LinkedList<>();
    private String action;

    // 添加通知同学
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // 删除通知同学
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // 通知所有同学
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    // 获取通知状态
    @Override
    public String getAction() {
        return action;
    }

    // 设置通知状态
    @Override
    public void setAction(String action) {
        this.action = action;
    }

}
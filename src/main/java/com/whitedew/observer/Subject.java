package com.whitedew.observer;

/**
 * @Author whitedew
 * @Date 2021/8/8 14:57
 */
public interface Subject {

    // 增加观察者
    public void attach(Observer observer);

    // 删除观察者
    public void detach(Observer observer);

    // 通知所有观察者
    public void notifyObservers();

    // 主体(被观察者)状态
    public void setAction(String action);

    public String getAction();

}
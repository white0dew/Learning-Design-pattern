package com.whitedew.strategy;

/**
 * @Author whitedew
 * @Date 2021/5/25 22:40
 */
public class FakeStrategy extends AbstractStrategy{

    @Override
    //子类实现的具体方法
    public void ItsInterface() {
        System.out.println("I'm using this method");
    }
}

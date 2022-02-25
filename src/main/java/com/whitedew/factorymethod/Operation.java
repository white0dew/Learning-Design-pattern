package com.whitedew.factorymethod;

/**
 * @Author whitedew
 * @Date 2021/9/23 10:52
 */

//操作类
public class Operation {
    //子类能继承父类的所有属性，但父类若为私有属性，子类只是拥有，无法使用。
    //因此使用protected修饰
    protected double numberA = 0;
    protected double numberB = 0;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public double getResult() {
        double result = 0;
        return result;
    }
}

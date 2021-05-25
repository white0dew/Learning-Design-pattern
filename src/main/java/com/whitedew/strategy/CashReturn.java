package com.whitedew.strategy;

/**
 * @Author whitedew
 * @Date 2021/5/25 22:58
 */
public class CashReturn extends CashAbstract {

    //返利收费，初始化时必须输入返利条件以及返利金额
    private double moneyCondition = 0.0;
    private double moneyReturn = 0.0d;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;

        if (money >= moneyCondition) {
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }

        return result;
    }

}
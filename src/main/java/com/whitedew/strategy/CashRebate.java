package com.whitedew.strategy;

/**
 * @Author whitedew
 * @Date 2021/5/25 23:02
 */
public class CashRebate extends CashAbstract {

    //打折活动时，初始化必须输出打折的力度
    private double moneyRebate = 0.8;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }

}

package com.whitedew.strategy;

/**
 * @Author whitedew
 * @Date 2021/5/25 22:51
 */
public class CashContext {

    private CashAbstract CashAbstract;

    public CashContext(CashAbstract CashAbstract) {
        this.CashAbstract = CashAbstract;
    }

    public double getPrice(double money) {
        return CashAbstract.acceptCash(money);
    }

}
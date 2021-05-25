package com.whitedew.strategy;

/**
 * @Author whitedew
 * @Date 2021/5/25 22:57
 */
public class CashNormal extends CashAbstract {

    @Override
     public double acceptCash(double money) {
        return money;
     }
}

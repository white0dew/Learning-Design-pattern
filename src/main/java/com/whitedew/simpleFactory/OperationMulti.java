package com.whitedew.simpleFactory;

/**
 * @Author whitedew
 * @Date 2021/9/23 10:58
 */
public class OperationMulti extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = numberA * numberB;

        return result;
    }
}

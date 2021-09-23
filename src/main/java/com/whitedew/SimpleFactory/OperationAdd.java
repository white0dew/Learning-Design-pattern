package com.whitedew.SimpleFactory;

/**
 * @Author whitedew
 * @Date 2021/9/23 10:55
 */
public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        double result = 0;
        result = numberA + numberB;

        return result;
    }

}

package com.whitedew.simpleFactory;

/**
 * @Author whitedew
 * @Date 2021/9/23 10:59
 */
public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        if (numberB == 0) {
            try {
                throw new Exception("除数不能为0!");
            } catch (Exception e) {
                System.out.println("除数不能为0,请检查输入并尝试重新输入。");
                System.exit(-1);
            }
        }
        result = numberA / numberB;
        return result;
    }
}

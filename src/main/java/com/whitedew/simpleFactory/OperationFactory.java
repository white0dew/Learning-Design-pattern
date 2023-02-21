package com.whitedew.simpleFactory;

/**
 * @Author whitedew
 * @Date 2021/9/23 10:51
 */

//运算符工厂的简单工厂模式
//使用静态方法，通过接收的参数的不同来返回不同的对象实例。
public class OperationFactory {
    public static Operation createOperate(String operate) {
        Operation operation = null;

        if (operate == null) {
            System.out.println("操作符为空");
            System.exit(0);
        }
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMulti();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                System.out.println("操作符为空");
                System.exit(0);
        }
        return operation;
    }
}

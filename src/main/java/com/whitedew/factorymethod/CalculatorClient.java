package com.whitedew.factorymethod;


import com.whitedew.factorymethod.impl.AddFactory;
import com.whitedew.factorymethod.impl.DivFactory;
import com.whitedew.factorymethod.impl.MultiFactory;
import com.whitedew.factorymethod.impl.SubFactory;

import java.util.Scanner;

/**
 * @Author whitedew
 * @Date 2021/9/23 10:40
 */

//计算器运算符
public class CalculatorClient {
    public static void main(String[] args) {
        IFactory iFactory = null;
        int numberA = 0;
        int numberB = 0;
        String operationStr = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数字A : ");
        // 判断是否还有输入
        if (scanner.hasNext()) {
            numberA = scanner.nextInt();
            System.out.println("输入的数据为：" + numberA);
        }

        System.out.print("请选择运算符(+-*/): ");
        // 判断是否还有输入
        if (scanner.hasNext()) {
            operationStr = scanner.next();
            System.out.println("选择的运算符为：" + operationStr);
        }

        System.out.print("请输入数字B : ");
        // 判断是否还有输入
        if (scanner.hasNext()) {
            numberB = scanner.nextInt();
            System.out.println("输入的数据为：" + numberB);
        }

        switch (operationStr) {
            case "+":
                iFactory = new AddFactory();
                break;
            case "-":
                iFactory = new SubFactory();
                break;
            case "*":
                iFactory = new MultiFactory();
                break;
            case "/":
                iFactory = new DivFactory();
                break;
            default:
                System.out.println("操作符为空");
                System.exit(0);
        }
        Operation operation = iFactory.createOperation();
        operation.setNumberA(numberA);
        operation.setNumberB(numberB);
        double result = operation.getResult();

        System.out.println("结果为" + numberA + operationStr + numberB + "=" + result);

    }
}

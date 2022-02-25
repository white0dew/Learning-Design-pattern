package com.whitedew.strategy;

import java.util.Scanner;

/**
 * @Author whitedew
 * @Date 2021/5/25 22:32
 */
public class App {
    public static void main(String[] args) {
        CashContext cashContext = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入活动内容：1是正常收费，2是返利收费，3是打折活动");
        int in = scanner.nextInt();
        String type = "";

        switch (in) {
            case 1:
                cashContext = new CashContext(new CashNormal());
                type += "正常收费";
                break;

            case 2:
                cashContext = new CashContext(new CashReturn(300, 100));
                type += "满300返100";
                break;

            case 3:
                cashContext = new CashContext(new CashRebate(0.8));
                type += "打8折";
                break;

            default:
                System.out.println("请输入1/2/3");
                break;
        }

        double totalPrices = 0;

        System.out.print("请输入单价：");
        double price = scanner.nextDouble();
        System.out.print("请输入数量：");
        double num = scanner.nextDouble();
        totalPrices = cashContext.getPrice(price * num);

        System.out.println("单价：" + price + "，数量：" + num + "，类型：" + type + "，合计：" + totalPrices);

        scanner.close();
    }
}

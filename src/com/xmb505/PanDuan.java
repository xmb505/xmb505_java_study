package com.xmb505;

import java.util.Scanner;

public class PanDuan {
    public static void main(String[] args) {
        Scanner inputer = new Scanner(System.in);
        System.out.println("猜猜我年龄！");
        int ages = inputer.nextInt();
        if (ages == 18) {
            System.out.println("刚满十八岁～");
        }
        if (ages != 18) {
            System.out.println(ages > 18 ? "大了" : "小了");
        }
    }
}
package com.xmb505;

import java.util.Scanner;

public class Recycle {
    public static void main(String[] args) {
        Scanner inputer = new Scanner(System.in);
        System.out.println("输入一个整数，我会循环多少次还可以求他的和");
        int recyc = inputer.nextInt();
        if (recyc >= 0) {
            int addNumber = 0;
            //求和变量不能定义在循环里
            for (int dorec = 1 ; dorec <= recyc ; dorec++ ) {
                addNumber = addNumber + dorec;
                System.out.println("这是第" + dorec + "次循环，和是" + addNumber);
            }
        }
        else {
            System.out.println("wdnmd输入的啥玩意？");
        }
    }
}

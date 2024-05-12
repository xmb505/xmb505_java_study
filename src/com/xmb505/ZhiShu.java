package com.xmb505;

import java.util.Scanner;

public class ZhiShu {
    public static void main(String[] args) {
        Scanner inputer = new Scanner(System.in);
        System.out.println("给我一个数，我可以判断他是不是质数");
        int userInputer = inputer.nextInt();
        for (int meiJu = 2 ; true ; meiJu++) {
            if (meiJu == userInputer) {
                System.out.println("质数");
                break;
            }
            else if (userInputer % meiJu == 0) {
                System.out.println("不是质数" + '\t' + meiJu);
                break;
            }
        }
    }
}

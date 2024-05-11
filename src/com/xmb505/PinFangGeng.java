package com.xmb505;

import java.util.Scanner;

public class PinFangGeng {
    public static void main(String[] args) {
        Scanner inputer = new Scanner(System.in);
        System.out.println("输入一个数字，我给你求平方");
        int pingFang = inputer.nextInt() , temper = 0 , temper2 = 0;
        while (temper <= pingFang) {
            temper = temper2 * temper2;
            System.out.println(temper2);
            temper2++;
        }
        System.out.println(pingFang + "开根后数字在" + (temper2 - 1) + "和" + (temper2 - 2));
    }
}

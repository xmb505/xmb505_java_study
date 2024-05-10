package com.xmb505;

import java.util.Scanner;

public class RecycChufa {
    public static void main(String[] args) {
        Scanner inputer = new Scanner(System.in);
        System.out.println("请输入两个整数，我将会不用除法干掉他");
        int beiChushu = inputer.nextInt() , chuShu = inputer.nextInt() , counter = 0 , temper = beiChushu;
        if (beiChushu >= chuShu) {
            while (temper >= chuShu) {
                temper = temper - chuShu;
                counter++;
            }
            System.out.println("商是" + counter + "，余数是：" + temper);
        }
    }
}

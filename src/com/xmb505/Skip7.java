package com.xmb505;

import java.util.Scanner;

public class Skip7 {
    public static void main(String[] args) {
        System.out.println("我是逢7过，当输出的数字为7的倍数时就跳过");
        Scanner inputer = new Scanner(System.in);
        int inNumber = inputer.nextInt() , temper = 0;
        while (temper <= inNumber) {
            temper++;
            if (temper % 7 == 0) {
                System.out.println("过");
                continue;
            }
            System.out.println(temper);
            
        }
    }
}

package com.xmb505;

import java.util.Scanner;

public class PinFangGeng {
    public static void main(String[] args) {
        Scanner inputer = new Scanner(System.in);
        System.out.println("输入一个数字，我给你求平方");
        int pingFang = inputer.nextInt() , temper = 0 , temper2 = 0;
        for (int temper3 = 1 ; temper3 <= pingFang; temper3++) {
            if (temper3 * temper3 == pingFang) {
                System.out.println(temper3 + "是" + pingFang + "的根");
                break;
            }
            else if (temper3 * temper3 > pingFang) {
                System.out.println((temper3 - 1) + "是" + pingFang + "的根的整数部分");
                break;
            }          
        }
    }
}

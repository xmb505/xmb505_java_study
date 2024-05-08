package com.xmb505;

import java.util.Scanner;

public class ThreeUtils {
    public static void main(String[] args) {
        System.out.println("输入两个整数，我会输出最大的那个数！");
        Scanner inputer = new Scanner(System.in);
        int input1 = inputer.nextInt();
        int input2 = inputer.nextInt();
        int bigger = input1 > input2 ? input1 : input2;
        System.out.println(input1 > input2 ? input1 : input2);
        System.out.println(bigger);
        System.out.println(input1 == input2 ? "两个数相同" : "两个数不相同");
    }
}

package com.xmb505;

import java.util.Scanner;

public class TreeFunction {
    public static void main(String[] args) {
        System.out.println("请输入三个值，我来求出三个数的最大值");
        Scanner inputer = new Scanner(System.in);
        int input1 = inputer.nextInt();
        int input2 = inputer.nextInt();
        int input3 = inputer.nextInt();
        int max = input1 > input2 ? input1 : input2 > input3 ? input2 : input3;
        System.out.println(max);
    }
}

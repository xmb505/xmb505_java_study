package com.xmb505;

import java.util.Scanner;

public class MethodCompareSpared {
    public static void main(String[] args) {
        Scanner inputer = new Scanner(System.in);
        int area1 = getMianJi(inputer.nextInt() , inputer.nextInt()) , area2 = getMianJi(inputer.nextInt() , inputer.nextInt());
        System.out.println("第一个面积：" + area1 + '\t' + "第二个是：" + area2);
        if (area1 > area2) {
            System.out.println("第一个比第二个大");
        }
        else if (area1 < area2) {
            System.out.println("第一个比第二个小");
        }
        else if (area1 == area2) {
            System.out.println("相同");
        }
    }
    public static int getMianJi(int chang , int kuan) {
        int result = chang * kuan;
        return result;
    }
}

package com.xmb505;

import java.util.Scanner;

public class ZhiShuCarry {
    public static void main(String[] args) {
        System.out.println("我可以求出你规定范围内的所有质数！");
        Scanner inputer = new Scanner(System.in);
        System.out.print("请输入最小值：");
        int min = inputer.nextInt();
        System.out.print("请输入最大值：");
        int max = inputer.nextInt();
        if (min > max || min < 2) {
            System.out.println("您输入的数据非法");
        }
        else {
            arrayZhishu(min, max);
        }
    }

    public static void arrayZhishu (int min , int max) {
        int counter = 0 , zhishu = min;
        int zhishuArray [] = new int[max - min];
        for ( ; zhishu < max ; zhishu++) {
            for (int meiJu = 2 ; true ; meiJu++) {
                if (meiJu == zhishu) {
                    zhishuArray [counter] = zhishu;
                    counter++;
                    break;
                }
                else if (zhishu % meiJu == 0) {
                    break;
                }
            }
        }
        for (int zhishuArray2 = 0; zhishuArray2 < counter; zhishuArray2++) {
            System.out.print(zhishuArray[zhishuArray2] + " ");
        }
        System.out.println();
    }
}

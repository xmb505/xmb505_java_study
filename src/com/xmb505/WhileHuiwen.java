package com.xmb505;

import java.util.Scanner;

public class WhileHuiwen {
    public static void main(String[] args) {
        Scanner inputer = new Scanner(System.in);
        System.out.println("我会判断回文数");
        int cicleNumber = inputer.nextInt() , temper = cicleNumber , resultNumber = 0;
        //WTF？这里是怎么弄过的？数字为0也可以？？？才发现不是temper是inputer原始数据
        while (temper != 0) {
            int weiShu = temper % 10 ;
            temper = temper / 10 ;
            resultNumber = resultNumber * 10 + weiShu;
        }
        if (cicleNumber == resultNumber) {
            System.out.println("我是回文数 " + resultNumber);
        }
        else {
            System.out.println("我不是");
        }
    }
}
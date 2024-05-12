package com.xmb505;

import java.util.Scanner;

public class RemiZhishuWork {
    public static void main(String[] args) {
        //要用最好的质量来写哦！
        Scanner remiInputer = new Scanner(System.in);
        //创建一个输入触发器
        System.out.println("我是大数学家Remi，我会帮你算出一段数字之间所有的质数！");
        System.out.println("请输入第一个数：");
        int startNum = remiInputer.nextInt();
        // 创建一个 startNum 变量
        System.out.println("请输入第二个数：");
        int endNum = remiInputer.nextInt();
        // 创建一个 endNum 变量
        int temper = startNum;
        if (startNum < endNum) {
            if (temper == 1){
                temper = temper +1;
            }
            for ( ; temper < endNum ; temper++ ) {
                for (int meiju = 2 ; true ; meiju++ ) {
                    if (meiju == temper) {
                        System.out.println(temper);
                        break;
                    }
                    else if (temper % meiju == 0) {
                        break;
                    }
                    //这里是判断质数的地方
                }
            }
        }
        else {
            System.out.println("你他喵找茬是吧？");
        }
    }
}

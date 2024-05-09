package com.xmb505;

import java.util.Scanner;

public class PanDuan {
    public static void main(String[] args) {
        Scanner inputer = new Scanner(System.in);
        System.out.println("猜猜我年龄！");
        int ages = inputer.nextInt();
        if (ages >= 0 && ages <= 100) {   
        if (ages == 18) {
            System.out.println("刚满十八岁～");
        }
        else {
            System.out.println(ages > 18 ? "大了" : "小了");
            }
        switch (ages) {
            case 16:
                System.out.println("我是初音未来");
                break;
            case 31:
                System.out.println("我是重音テト");
            case 24:
                System.out.println("24岁，是学生");
            default:
                System.out.println("你只是一个普通人");
                break;
        }   
        if (ages % 2 == 0) {
            System.out.println("我是双岁");
        }
        else {
            System.out.println("我是单岁");
        }
        if (ages >= 0 && ages <=14) {
            System.out.println("真刑啊哥们");
        }
        else if (ages > 14 && ages <=40) {
            System.out.println("姐姐和我在一起吧");            
        }
        else if (ages > 40 && ages <= 70) {
            System.out.println("我看你也是风韵犹存");
        }
            else {
                System.out.println("出生啊！！！！");
            }
        }
        else {
            System.out.println("什么数字生命");
        }
    }
}

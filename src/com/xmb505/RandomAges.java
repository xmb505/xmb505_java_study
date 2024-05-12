package com.xmb505;

import java.util.Random;
import java.util.Scanner;

public class RandomAges {
    public static void main(String[] args) {
        Scanner inputer = new Scanner(System.in);
        Random randNum = new Random();
        int ages = randNum.nextInt(0,100) , counter = 0;
        System.out.println("我会生成1-100之内的随机整数，你来猜哦！");
        while (counter < 7) {
            counter++;
            System.out.println("第" + counter + "次猜测");
            int userInputer = inputer.nextInt();
            if (userInputer == ages) {
                System.out.println("回答正确！");
                break;
            }         
            else if (userInputer < ages) {
                System.out.println("小了");
            }            
            else if (userInputer > ages) {
                System.out.println("大了");
            } 
        }
        System.out.println("不玩了，触发保底，数字为：" + ages);
    }
}

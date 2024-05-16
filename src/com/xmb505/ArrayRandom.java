package com.xmb505;

import java.util.Random;

public class ArrayRandom {
    public static void main(String[] args) {
        Random randNums = new Random();
        int arraySum [] = new int[100];
        for (int arraySum2 = 0; arraySum2 < arraySum.length; arraySum2++) {
            int randArray = randNums.nextInt(100);
            arraySum[arraySum2] = randArray;
        }
        //给表中每一个数据赋值
        int sumTemp = arraySum[0];
        for (int arraySum2 = 1; arraySum2 < arraySum.length; arraySum2++) {
            sumTemp = sumTemp + arraySum[arraySum2];
        }
        //求和
        int sumCounter = 0;
        for (int arraySum2 = 0; arraySum2 < arraySum.length; arraySum2++) {
            if (arraySum[arraySum2] < sumTemp / arraySum.length) {
                sumCounter++;
            }
        }
        //求比平均数的数小的数有多少个
        System.out.println("生成的随机数总和是：" + sumTemp);
        System.out.println("平均数是：" + (sumTemp / arraySum.length) + '\t' + "比平均数小的数有：" + sumCounter);
    }
}

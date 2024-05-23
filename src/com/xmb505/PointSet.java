package com.xmb505;

import java.util.Scanner;

public class PointSet {
    public static void main(String[] args) {
        Scanner inputer = new Scanner(System.in);
        System.out.println("选手表演结束，请评委打分！");
        System.out.print("请输入评委数：");
        int setNum = inputer.nextInt();
        System.out.println("本次打分最低零分，最高十分，掐头去尾取平均数。");
        boolean userMind = yesNoChecker("您是否确定？（Y/n）", "好哒！" , "中止！");
        if (userMind == true) {
            double point[] = new double[setNum];
            for (int temp = 0 ; temp < setNum ; temp++) {
                System.out.print("请打印第" + (temp + 1) + "个评委的评分：");
                double inputTemp = inputer.nextDouble();
                while (inputTemp < 0 || inputTemp > 10) {
                    System.out.print("数据非法，请重新输入：");
                    inputTemp = inputer.nextDouble();
                }
                point[temp] = inputTemp; 
            }
            killHeadTailArray(point);
        }
        else {
        }
    }

    public static boolean yesNoChecker(String askInput , String trueReturn , String falseReturn) {
        Scanner inputer = new Scanner(System.in);
        System.out.print(askInput);
        String userInput = inputer.nextLine().toLowerCase();
        //这里加的参数代表对大小写不敏感
        boolean result1 = userInput.isEmpty() , result2 = "y".equals(userInput) , result3 = result1 ^ result2;
        if (result3) {
            System.out.println(trueReturn);
            return result3;
        }
        else {
            System.out.println(falseReturn);
            return result3;
        }
    }

    public static void killHeadTailArray (double array[]) {
        double tempMax = array[0] , tempMin = array[0];
        for (int array2 = 1 ; array2 < array.length ; array2++) {
            if (array[array2] > array[array2 - 1]) {
                if (tempMax > array[array2]) {
                }
                else {
                    tempMax = array[array2];
                }
                //这里是判断最大数
                if (tempMin < array[array2 - 1]) {
                }
                else {
                    tempMin = array[array2 - 1];
                }
                //这里是判断最小数
            }
            if (array[array2] < array[array2 - 1]) {
                if (tempMax > array[array2 - 1]) {
                }
                else {
                    tempMax = array[array2 - 1];
                }
                //这里是判断最大数
                if (tempMin < array[array2]) {
                }
                else {
                    tempMin = array[array2];
                }
                //这里是判断最小数
            }
        }
        System.out.println(tempMax + " " +tempMin);
        double tempSum = 0;
        for (int array2 = 0; array2 < array .length; array2++) {
            tempSum = tempSum + array[array2];
        }
        double pingjunshu = (tempSum - tempMax - tempMin) / (array.length - 2);
        System.out.println(pingjunshu);
    }
}


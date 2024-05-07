package com.xmb505;

import java.util.Scanner;

public class CompareMath {
    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);
        System.out.println("输入两个值");
        int userInput1 = scInput.nextInt();
        int userInput2 = scInput.nextInt();
        System.out.println(userInput1 == userInput2);
        System.out.println(userInput1 != userInput2);
        boolean result = userInput1 >= userInput2;
        System.out.println(result);
    }
}

package com.xmb505;

import java.util.Scanner;

public class NumberSix {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("请随便输入两个个整数，如果他是六或者和是六的倍数我会输出true");
        System.out.println("请输入第一个数");
        int inputOne = scannerInput.nextInt();
        System.out.println("请输入第二个数");
        int inputTwo = scannerInput.nextInt();
        boolean sixCompare = inputOne == 6 || inputTwo == 6;
        int numberAdder = inputOne + inputTwo;
        boolean numberAddCompare = numberAdder % 6 == 0;
        boolean result = sixCompare || numberAddCompare;
        System.out.println(result);
    }

}

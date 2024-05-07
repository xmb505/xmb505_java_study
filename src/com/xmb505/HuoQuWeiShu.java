package com.xmb505;

import java.util.Scanner;

public class HuoQuWeiShu {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("请输入三位数整数，我来拆开你的数字！");
        int input = scannerInput.nextInt();
        int ge = (input % 10), shi = (input / 10 % 10), bai = (input / 100 % 10);
        System.out.println("个位数是：" + ge);
        System.out.println("十位数是：" + shi);
        System.out.println("百位数是：" + bai);
        //System.out.println(scannerInput);
    }
}

package com.xmb505;

import java.util.Scanner;

public class MethodSpaure {
    public static void main(String[] args) {
        Scanner inputer = new Scanner(System.in);
        while (true) {
            getZhouChang(inputer.nextInt(), inputer.nextInt());
        }
    }
    public static void getZhouChang(int chang , int kuan) {
        System.out.println("周长是" + ((chang + kuan) * 2));        
    }
}

package com.xmb505;

import java.util.Scanner;

public class WhileDemoZhumulangma {
    public static void main(String[] args) {
        //珠穆朗玛 8844430
        Scanner inputer = new Scanner(System.in);
        System.out.println("我可以算出要折多少张纸");
        double counter = 0 , paperHigh = 0.1 , higher = inputer.nextInt() ;
        if (higher >= 1) {
            while (paperHigh < higher) {
                paperHigh = paperHigh * 2 ;
                counter++;
            }
            System.out.println("折" + higher + "需要折" + counter + "次，纸有" + paperHigh + "高");
        }
        else {
            System.out.println("wdnmd");
        }
    }
}

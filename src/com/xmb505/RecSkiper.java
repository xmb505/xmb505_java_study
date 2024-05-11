package com.xmb505;

import java.util.Scanner;

public class RecSkiper {
    public static void main(String[] args) {
        Scanner inputer = new Scanner(System.in);
        for (int recNumber = inputer.nextInt() , recyc = 0; recyc <= recNumber ; recyc++ ) {
            if (recyc == 3) {
                //跳过循环desu
                continue;
            }
            System.out.println(recyc);
        }
        System.out.println("-----------------------");
        for (int recNumber = inputer.nextInt() , recyc = 0; recyc <= recNumber ; recyc++ ) {
            System.out.println(recyc);
            System.out.println("计数器");
            if (recyc == 3) {
                //打断循环desu
                break;
            }
        }
    }
}

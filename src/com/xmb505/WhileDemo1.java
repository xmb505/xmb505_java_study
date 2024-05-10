package com.xmb505;

import java.util.Scanner;

public class WhileDemo1 {
    public static void main(String[] args) {
        Scanner inputer = new Scanner(System.in);
        int recyc = inputer.nextInt() , printCounter = 0;
        while ( printCounter < recyc ) {
            printCounter++;
            System.out.println(printCounter);
        }
    }
}

package com.xmb505;

import java.util.Scanner;

public class RecTest1 {
    public static void main(String[] args) {
        Scanner inputer = new Scanner(System.in);
        int bufferStart = inputer.nextInt() , bufferEnd = inputer.nextInt() , counter = 0;
        if (bufferStart <= bufferEnd) {
            int bufferPlayer = bufferStart;
            for ( ; bufferPlayer <= bufferEnd ; bufferPlayer++ ) {
                if ( bufferPlayer % 15 == 0) {
                    //int bufferAdder = bufferPlayer;
                    //bufferPlayer = bufferPlayer + bufferAdder ;
                    counter++;
                    System.out.println("数字：" + bufferPlayer + '\t' + "第：" + counter);
                }
            }
        }
        else System.out.println("爬");
    }
}

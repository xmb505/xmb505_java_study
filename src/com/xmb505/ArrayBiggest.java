package com.xmb505;

import java.util.Scanner;

public class ArrayBiggest {
    public static void main(String[] args) {
        System.out.println("你给我五个数字，我能告诉你谁最大！！！");
        int arrayBiggest[] = new int[5];
        Scanner inputer = new Scanner(System.in);
        for (int arrayBiggest2 = 0; arrayBiggest2 < arrayBiggest.length; arrayBiggest2++) {
            int recInputer = inputer.nextInt();
            arrayBiggest[arrayBiggest2] = recInputer;
        }
        int compareTempBiggest = arrayBiggest[0];
        for (int arrayBiggest2 = 1; arrayBiggest2 < arrayBiggest.length; arrayBiggest2++) {
            if (arrayBiggest[arrayBiggest2] > compareTempBiggest) {
                compareTempBiggest = arrayBiggest[arrayBiggest2];
            }
        }
        System.out.println("最大的数字是" + compareTempBiggest);
        int compareTempsSmallest = arrayBiggest[0];
        for (int arrayBiggest2 = 1; arrayBiggest2 < arrayBiggest.length; arrayBiggest2++) {
            if (arrayBiggest[arrayBiggest2] < compareTempsSmallest) {
                compareTempsSmallest = arrayBiggest[arrayBiggest2];
            }
        }
        System.out.println("最小的数字是" + compareTempsSmallest);
    }
}

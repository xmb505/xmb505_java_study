package com.xmb505;

import java.util.Random;

public class ArrayRandPaidui {
    public static void main(String[] args) {
        Random randNumber = new Random();
        int arrayPaidui [] = {1,2,3,4,5,6,7,8,9};
        for (int arrayPaidui2 = 0 , temp = 0 , counter = 0 ; arrayPaidui2 < arrayPaidui.length; arrayPaidui2++) {
            counter = randNumber.nextInt(0,8);
            temp = arrayPaidui[arrayPaidui2];
            arrayPaidui[arrayPaidui2] = arrayPaidui[counter]; 
            arrayPaidui[counter] = temp;
        }
        for (int arrayPaidui2 = 0; arrayPaidui2 < arrayPaidui.length; arrayPaidui2++) {
            System.out.print(arrayPaidui[arrayPaidui2] + " ");
        }
    }
}

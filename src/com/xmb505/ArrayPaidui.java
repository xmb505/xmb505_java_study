package com.xmb505;

public class ArrayPaidui {
    public static void main(String[] args) {
        int arrayPaidui [] = {1,2,3,4,5,6,7,8,9};
        for (int arrayPaidui2 = 0 , arrayPaidui3 = arrayPaidui.length - 1 ; arrayPaidui2 < arrayPaidui3 ; arrayPaidui2++ , arrayPaidui3--) {
            int temp = 0;
            temp = arrayPaidui[arrayPaidui2];
            arrayPaidui[arrayPaidui2] = arrayPaidui[arrayPaidui3];
            arrayPaidui[arrayPaidui3] = temp;
        }
        for (int arrayPaidui2 = 0; arrayPaidui2 < arrayPaidui.length; arrayPaidui2++) {
            System.out.print(arrayPaidui[arrayPaidui2] + " ");
        }
    }
}

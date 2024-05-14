package com.xmb505;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int array [] = {1,2,3,4,5,6,7,8,9,10} , tempNum = 0;
        for (int array2 = 0; array2 < array.length; array2++) {
            if (array[array2] % 3 == 0) {
                tempNum++;
            }
        }
        System.out.println(tempNum);
    }
}

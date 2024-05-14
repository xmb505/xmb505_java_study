package com.xmb505;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int array [] = {1,2,3,4,5,6,7,8,9,10};
        for (int array2 = 0; array2 < array.length ; array2++) {
            if (array[array2] % 2 == 0) {
                array[array2] = array[array2] / 2;
            }            
            else if (array[array2] % 2 != 0) {
                array[array2] = array[array2] * 2;
            }
        }
        for (int array2 = 0; array2 < array.length; array2++) {
            System.out.println(array[array2]);
        }
    }
}

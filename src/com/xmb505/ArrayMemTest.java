package com.xmb505;

public class ArrayMemTest {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        System.out.println(array[2]);
        changeArray(array);
        System.out.println(array[2]);
    }

    public static void changeArray (int array[]) {
        array [2] = 12;
    }
}

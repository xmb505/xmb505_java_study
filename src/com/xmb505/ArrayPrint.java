package com.xmb505;

import java.util.Scanner;

public class ArrayPrint {
    public static void main(String[] args) {
        int arrayInputer[] = {1,9,2,3,4,7,4,4};
        Scanner inputer = new Scanner(System.in);
        int enterNum = inputer.nextInt();
        arrayEnter(arrayInputer, enterNum);
        arrayCopyRange(arrayInputer, 2 , 5);
    }
    
    public static void arrayPrinter(int array[]) {
        System.out.print("(");
        for (int array2 = 0; array2 < array.length; array2++) {
            System.out.print(array[array2]);
            if (array2 == array.length - 1) {
                System.out.print(")");
                System.out.println();
            }
            else {
                System.out.print(", ");
            }
        }
    }

    public static void arrayMaxier (int array[]) {
        int temp = array[0];
        for (int array2 = 1; array2 < array.length; array2++) {
            if (temp < array[array2]) {
                temp = array[array2];
            }
        }
        System.out.println("最大数是：" + temp);
    }

    public static void arrayEnter (int array[] , int enter) {
        for (int array2 = 0; array2 < array.length; array2++) {
            if (array[array2] == enter) {
                System.out.println("有这个数");
                break;
            }
            else if (array2 == array.length - 1) {
                System.out.println("没有");
            }
        }
    }

    public static void arrayCopyRange (int inputArray[] , int from , int to) {
        int outArray [] = new int [to - from];
        int currentFrom = from - 1 , currentTo = to - 1;
        for (int counter = 0; currentFrom <= currentTo; currentFrom++) {
            outArray [counter] = inputArray[currentFrom];
            System.out.print(outArray[counter] + " ");
        }
        System.out.println();
    }
}

package com.xmb505;

public class Shuzu {
    public static void main(String[] args) {
        //数组desu
        System.out.println("哈利路大旋风！🧊");
        int array [] = {1,1,4,5,1,4,1,9,1,9,8,1,0} , tempNum = 0;
        for (int array2 = 0; array2 < array.length; array2++) {
            tempNum = array[array2] + tempNum;
        }
        System.out.println(tempNum);
    }
}

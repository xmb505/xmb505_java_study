package com.xmb505;

public class EnterCode {
    public static void main(String[] args) {
        char array [] = randomAlpha();
        for (int array2 = 0; array2 < array.length; array2++) {
            System.out.println(array[array2]);
        }        
    }

    //生成大小写字母数组
    public static char [] randomAlpha () {
        char alpha [] = new char[52];
        for (int alpha2 = 0; alpha2 < alpha.length; alpha2++) {
            if (alpha2 <= 25) {
                alpha[alpha2] = (char)(97 + alpha2);
            }
            else {
                alpha[alpha2] = (char)(39 + alpha2);
            }
        }
        return alpha;
    }
}

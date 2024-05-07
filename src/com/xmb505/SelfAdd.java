package com.xmb505;

public class SelfAdd {
    public static void main(String[] args) {
        int demo1 = 11;
        demo1++;
        System.out.println(demo1);
        demo1--;
        System.out.println(demo1);
        System.out.println("_______________________________");
        int demo2 = 90;
        int demo3 = demo2++;
        int demo4 = ++demo2;
        System.out.println(demo2 + " " + demo3 + " " + demo4);
        System.err.println("----------------------------------");
        int demo5 = 10, demo6 = 20;
        System.out.println(demo5 + " " + demo6);
        demo5 += demo6;
        System.out.println(demo5 + " " + demo6);
        System.out.println("-----------------------------------");

    }
}

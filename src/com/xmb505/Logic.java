package com.xmb505;

public class Logic {
    public static void main(String[] args) {
        // & 并且 双真为真
        System.out.println(true & true);
        System.out.println(false & true);
        System.out.println(false & false);

        // | 或者 一真为真
        System.out.println(true | true);
        System.out.println(false | true);
        System.out.println(false | false);

        // ^ 异或 同假异真
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ false);

        // ! 取反 一身反骨
        System.out.println(!true);
        System.out.println(!false);

        // && 短路与 一假全假
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(false && false);

        // || 一真全假
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(false || false);

        //短路效果演示，多使用短路运算符会优化程序效果
        //如果需要左边确定了，右边将不会被执行，需要执行右边代码的情况不要使用短路运算符
        int demoa = 10, demob = 10;
        boolean demoResult = ++demoa < 9 && ++demob < 9;
        System.out.println(demoResult);
        System.out.println(demoa);
        System.out.println(demob); //这里b并没进行自加操作
    }
}

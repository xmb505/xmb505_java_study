package com.xmb505;

import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        Scanner inputer = new Scanner(System.in);
        System.out.println("这里是新毛航空！欢迎来到售票系统！");
        int month = monthGet();
        int seat = seatGet();
        double money = moenyGet();
        //采集用户输入
        System.out.println("请确认您提交的信息：");
        System.out.println("登机月份是：" + month + "月");
        if (seat == 1) {
            System.out.println("座位类型是：头等舱");
        }
        else if (seat == 2) {
            System.out.println("座位类型是：经济舱");
        }
        boolean checker = yesNoChecker("请确认上述信息是否正确（Y/n）", "" , "中止");
        if (checker == true) {
            System.out.println("结算价格是：" + slashCompute(month, seat, money));
        }
        else {

        }
    }

    public static int monthGet () {
        Scanner inputer = new Scanner(System.in);
        System.out.print("请输入月份：");
        for (int month = inputer.nextInt() ; true ; ) {
            if (month > 0 && month < 13) {
                return month;
            }
            else {
                System.out.println();
                System.out.print("数据非法，请重新输入月份：");
                month = inputer.nextInt();
            }
        }
    }

    public static int seatGet() {
        Scanner inputer = new Scanner(System.in);
        System.out.print("输入1买头等舱，输入2买经济舱：");
        for (int seat = inputer.nextInt() ; true ; ) {
            if (seat > 0 && seat < 3) {
                return seat;
            }
            else {
                System.out.println();
                System.out.print("数据非法，请重新输入座位：");
                seat = inputer.nextInt();
            }
        }
    }

    public static double moenyGet() {
        Scanner inputer = new Scanner(System.in);
        System.out.print("标准票价是：");
        double money = inputer.nextDouble();
        return money;
    }

    public static double slashCompute (int month , int seat , double money) {
        if (month > 4 && month < 11) {
            if (seat == 1) {
                double back = money * 0.9;
                return back;
            }
            else {
                double back = money * 0.85;
                return back;
            }
        }
        else {
            if (seat == 1) {
                double back = money * 0.7;
                return back;
            }
            else {
                double back = money * 0.65;
                return back;
            }
        }
    }

    public static boolean yesNoChecker(String askInput , String trueReturn , String falseReturn) {
        Scanner inputer = new Scanner(System.in);
        System.out.print(askInput);
        String userInput = inputer.nextLine().toLowerCase();
        //这里加的参数代表对大小写不敏感
        boolean result1 = userInput.isEmpty() , result2 = "y".equals(userInput) , result3 = result1 ^ result2;
        if (result3) {
            System.out.println(trueReturn);
            return result3;
        }
        else {
            System.out.println(falseReturn);
            return result3;
        }
    }
}
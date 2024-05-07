import java.util.Scanner;
public class Scannerdemo {
    public static void main (String[] args){
        //创建对象
        Scanner sc = new Scanner(System.in);
        System.out.println("我是琪露诺，我的数学特别好，我来帮你算数吧！");
        System.out.println("请输入第一个加数");
        int addNumber1 = sc.nextInt();
        //接受数据
        System.out.println("请输入第二个加数");
        int addNumber2 = sc.nextInt();
        System.out.println("我算出来了，是：");
        System.out.println(addNumber1 + addNumber2);
    }    
}
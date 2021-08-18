package API;

import java.util.Scanner;

public class demo2Scanner {
    public static void main(String[] args) {

        /*
        * 当nextInt,和nextline一起使用时，nextLine方法没有机会使用
        *
        *建议，键盘录入数据时，字符串和整数一起接收，建议用next方法接收字符串。
        *
        * */
        //创建对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数");

        int i = sc.nextInt();

        System.out.println("请输入字符串：");

        String s = sc.nextLine();

        System.out.println(i);
        System.out.println(s);


    }
}

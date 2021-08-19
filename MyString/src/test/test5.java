package test;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("请输入手机号：");

        String tel = sc.nextLine();
        //截取字符串前三位
        String start = tel.substring(0,3);
        //截取字符串后四位
        String end = tel.substring(7);
        //组合屏蔽的手机号即可
        System.out.println(start+"****"+end);
    }
}

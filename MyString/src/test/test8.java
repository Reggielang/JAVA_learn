package test;

import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String s = sc.nextLine();
        //反转字符串 -- 将字符串对象变为StringBuilder对象
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        //s:String sb: StringBuilder 类型不统一！ 需要转换为String
        String reversesb = sb.toString();

        if (s.equals(reversesb)){
            System.out.println("对称的哦");
        }else
        {
            System.out.println("不对称的");
        }
    }
}

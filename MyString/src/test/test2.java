package test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String s = sc.nextLine();

        //遍历字符串,首先要获取字符串里的一个字符
        for (int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            System.out.println(c);
        }
    }
}

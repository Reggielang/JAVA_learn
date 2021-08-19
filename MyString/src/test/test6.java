package test;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String s = sc.nextLine();
        //替换字符串
        String news =s.replace("TMD","***");
        System.out.println(news);
    }
}

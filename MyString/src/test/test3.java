package test;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String s = sc.nextLine();

        //将字符串拆分成字符数组
        char[] chars = s.toCharArray();
        //遍历数组
        for (int i=0;i<chars.length;i++){
            System.out.println(chars[i]);
        }

    }
}

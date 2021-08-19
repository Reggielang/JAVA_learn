package test;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        //统计字符次数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String s = sc.nextLine();

        int bigcount = 0;
        int smallcount = 0;
        int numcount = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c>='A'&&c<='Z'){
                bigcount++;
            }else if (c>='a'&&c<='z'){
                smallcount++;
            }else if (c>='0'&&c<='9'){
                numcount++;
            }
        }

        //打印三种类型的字符个数
        System.out.println(bigcount);
        System.out.println(smallcount);
        System.out.println(numcount);
    }
}

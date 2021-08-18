package API;

import java.util.Scanner;

public class demoScanner {
    public static void main(String[] args) {
        /*

        next-遇到空格，就不再录入数据
            结束标记：空格，tab键

        nextLine-可以将数据完整的输入
            结束标记：回车换行符
         */


        //创建对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        //调用nextLine方法
        // ctrl+alt+v --快速生成方法返回值
        String s = sc.nextLine();

        System.out.println(s);
    }
}

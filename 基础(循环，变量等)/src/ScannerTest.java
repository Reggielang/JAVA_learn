//如何从键盘获取不同类型的变量
//需要使用Scanner类
//1、导包 import java.util.Scanner;
//实例化 Scanner scan = new Scanner(System.in);
//3、调用Scanner类的相关方法，来获取指定类型的数据

import java.util.Scanner;
public class ScannerTest {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("请输入你的姓名：");
            String name = scan.next();
            System.out.println(name);

            System.out.println("请输入你的年龄：");
            int age = scan.nextInt();
            System.out.println(age);

            System.out.println("请输入你的体重：");
            double weight = scan.nextDouble();
            System.out.println(weight);
            //注意：需要根据相应的方法，来输入特定的类型数据，如果输入的数据类型不匹配时会报错。InputMatchException
            System.out.println("请是否相中我了呢：（true、false）");
            boolean answer = scan.nextBoolean();
            System.out.println(answer);
        }
}

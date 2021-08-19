package test;

import domain.Student;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("请输入：");
        String s = sc.nextLine();
        //根据规则进行切割，然后返回字符串数组
        String[] sArr = s.split(",");

//        System.out.println(sArr[0]);

        Student stu = new Student(sArr[0],sArr[1]);

        System.out.println(stu.getName()+"--"+stu.getAge());


    }
}

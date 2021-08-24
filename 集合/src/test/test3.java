package test;

import domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> list = new ArrayList<Student>();
        //调用三次方法，创建三个学生对象
        Student stu1 = getStudent();
        Student stu2 = getStudent();
        Student stu3 = getStudent();

        //向集合中添加学生对象
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student temp = list.get(i);
            System.out.println(temp.getName()+"--"+temp.getAge());
        }

    }
    
    private static Student getStudent() {
        //录入学生对象所需要的数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        // next(),nextLine() nextInt();
        String name =  sc.next();
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        //把数据赋值给学生的对象
        Student stu = new Student(name,age);
        return stu;
    }
}

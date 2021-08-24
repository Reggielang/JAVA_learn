package test;

import domain.Student;

import java.util.ArrayList;

public class test5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("张三",10);
        Student stu2 = new Student("张三",10);
        Student stu3 = new Student("张三",20);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        ArrayList<Student> newlist =  getList(list);
        for (int i = 0; i < newlist.size(); i++) {
            Student temp = newlist.get(i);
            System.out.println(temp.getName()+"--"+temp.getAge());
        }

    }

    //定义方法，形参为ArrayList<Student>
    public static ArrayList<Student> getList(ArrayList<Student> list){
        //定义一个新集合，准备储存筛选出来的学生对象ArrayList<Student>
        ArrayList<Student> newlist = new ArrayList<Student>();
        //遍历原集合，获取学生对象
        for (int i = 0; i < list.size(); i++) {
            Student temp = list.get(i);
            int age = temp.getAge();
            if (age<18){
                newlist.add(temp);
            }
        }
        return newlist;
    }
}

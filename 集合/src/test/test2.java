package test;

import domain.Student;

import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> list = new ArrayList<>();
        //创建学生对象
        Student stu1 = new Student("张三",23);
        Student stu2 = new Student("张三2",23);
        Student stu3 = new Student("张三3",23);
        //添加学生对象到集合中
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //遍历集合，采用通用遍历的方式
        for (int i = 0; i < list.size(); i++) {
            Student temp = list.get(i);
            //取出的是学生对象（地址值）,需要用get方法取出学生的信息
            System.out.println(temp.getName()+"--"+temp.getAge());
        }
    }
}

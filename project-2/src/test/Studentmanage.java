package test;

import domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Studentmanage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //创建一个集合容器对象
        ArrayList<Student> list = new ArrayList<>();



        lo:while (true){
        //搭建主界面菜单
        System.out.println("-----------欢迎使用学生管理系统--------------------");
        System.out.println("1 添加学生");
        System.out.println("2 删除学生");
        System.out.println("3 修改学生");
        System.out.println("4 查看学生");
        System.out.println("5 退出");
        System.out.println("请进行操作：");

        String choice = sc.next();

        switch (choice){
            case "1":
//                System.out.println("添加学生");
                addStudent(list);
                break;
            case "2":
//                System.out.println("删除学生");
                deleteStudent(list);
                break;
            case "3":
//                System.out.println("修改学生");
                changeStudent(list);
                break;
            case "4":
//                System.out.println("查看学生");
                showStudent(list);
                break;
            case "5":
                System.out.println("感谢你的使用");
                //退出指定循环
                break lo;
            default:
                System.out.println("您的输入有误，请重试！");
                break;
        }
    }
}

    private static void changeStudent(ArrayList<Student> list) {
        System.out.println("请输入你要修改的学生学号：");
        Scanner sc = new Scanner(System.in);
        String changesid = sc.next();
        int index = getIndex(list,changesid);
        if (index == -1){
            System.out.println("查无此人，请重新输入");
        }else {
            //修改学生的信息
            System.out.println("请输入新的学生姓名：");
            String name = sc.next();
            System.out.println("请输入新的学生年龄：");
            int age = sc.nextInt();
            System.out.println("请输入新的学生生日：");
            String birthday = sc.next();

            Student newstu = new Student(changesid,name,age,birthday);
            //调用集合set方法完成修改
            list.set(index,newstu);
            System.out.println("修改成功！");
        }
    }

    public static void deleteStudent(ArrayList<Student> list) {
        System.out.println("请输入删除的学生学号：");
        Scanner sc = new Scanner(System.in);
        String deletesid  = sc.next();
        int index = getIndex(list, deletesid);
        if (index == -1){
            System.out.println("查无信息，请重新输入");
        }else {
            list.remove(index);
            System.out.println("删除成功！");
        }

    }

    //查看学生
    public static void showStudent(ArrayList<Student> list) {
        //判断集合中是否存在数据
        if (list.size() == 0){
            System.out.println("无学生信息，请添加后重试~");
            return;
        }
        //存在展示表头数据
        System.out.println("学号\t\t姓名\t\t年龄\t\t生日");
        //遍历数据获取集合中的学生对象的信息
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getSid()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getBirthday());
        }
        System.out.println();
    }

    //添加学生方法
    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);

        //给出录入提示信息
        String sid;
        while (true){
            System.out.println("请输入学号：");
            sid = sc.next();
            int index = getIndex(list,sid);
            if (index ==-1){
                //sid不存在就可以使用
                break;
            }
        }

        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("请输入生日：");
        String birthday = sc.next();
        //键盘输入信息封装为学生对象
        Student stu = new Student(sid,name,age,birthday);
        //将封装好的学生对象，添加到集合容器中
        list.add(stu);
        //给出添加成功信息
        System.out.println("添加成功！");
    }

    public static int getIndex(ArrayList<Student> list, String sid){
        //接收集合对象，和学生学号，查找这个学号在集合中的索引位置
        //假设转入的学号，不存在
        int index = -1;
        //遍历集合获取每个学生对象去查找
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            //获取学号
            String id = stu.getSid();
            //对比学号
            if (id.equals(sid)){
                //存在：让index记录当前的索引位置
                index = i;
        }
    }
        return index;
    }
}

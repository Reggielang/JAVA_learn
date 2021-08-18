package test1;

/*
* private 关键字--用于修饰成员，变量和方法
* 特点：只能在本类当中访问
*针对私有成员变量，可以通过设置值和获取值的方法来访问，提高数据安全性
* */

public class Student {
     String name;
     private int age;
     //设置值
    public void setAge(int a){
        if (a >= 0 &&a<=120){
        age = a;
    }else {
        System.out.println("输入年龄不合理");}
    }
    //获取值
    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println(name+"--"+age);
    }
}

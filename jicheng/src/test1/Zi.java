package test1;
//如果子父类，出现了重名的成员变量，可以使用super关键字来访问父类的成员变量
/*
super 关键字的用法和this关键字的用法相似
this,代表本类对象的引用
super，代表父类存储空间的标识

 */
public class Zi extends Fu{
    //子类中出现了重名的父类对象
    int a = 20;

    public void method(){
        int a = 30;
        System.out.println(a); //30

        //需求1：在控制台打印本类成员变量20
        System.out.println(this.a);
        //需求2：在控制台打印父类成员变量10
        System.out.println(super.a);
    }
}

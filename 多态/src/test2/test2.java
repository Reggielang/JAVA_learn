package test2;

import java.util.zip.ZipEntry;

/*
多态的成员访问特点
成员变量 -- 编译看左边父类，运行看父类
成员方法 -- 编译看左边父类， 运行看子类!!!
 */
public class test2 {
    public static void main(String[] args) {
        Fu f = new Zi();
        System.out.println(f.num);
        f.method();

    }
}


class Fu{
    int num =10;
    public void method(){
        System.out.println("Fu...method");
    }
}


class Zi extends Fu{
    int num = 20;
    public void method(){
        System.out.println("Zi...method");
    }
}
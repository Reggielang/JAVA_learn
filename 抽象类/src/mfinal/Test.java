package mfinal;
/*
final 修饰方法 方法不能被重写
final 修饰变量，不能被再次赋值
final 修饰类， 不能被继承

 */
public class Test {
    public static void main(String[] args) {
        /*
        final 修饰变量
        基本类型变量：只能被赋值一次，不能再进行任何赋值或修改 （常量全用大写）
        引用类型变量：地址值不能更改，但是可以修饰对象的属性值
         */

        final int A = 10;
//        a =20;

        final student stu = new student();
        stu.setName("张三");
        stu.setName("李四");

//        stu = new student();


    }
}


class student{
    //final 修饰成员变量，初始化时机：创建的时候，直接赋值，或者在构造方法结束前，完成赋值
    final int a =10;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
final class Fu{}

//class Zi extends Fu{}
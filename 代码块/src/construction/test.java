package construction;
/*
构造代码块：
位置：类中方法外定义
特点；每次构造方法执行时，都会执行该代码块中的代码，并且在构造方法执行前执行
作用：将多个构造方法中相同的代码，抽取到构造代码块中，提高代码的复用率

 */
public class test {
    public static void main(String[] args) {
        student s = new student();
        student s2 = new student(10);
    }
}


class student{
    {
        System.out.println("我是构造代码块");
    }
    public student(){
        System.out.println("无参构造");
    }
    public student (int a){
        System.out.println("有参构造");
    }
}
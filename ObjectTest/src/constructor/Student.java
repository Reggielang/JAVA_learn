package constructor;

public class Student {
    /*
    * 格式
    * 1.方法名需要和类名一致
    * 2.没有返回值类型，连void都没有
    *3.没有具体返回值（不能由return带回具体的结果）
    * 创建对象的时候调用，不能手动调用构造方法
    *
    * 作用：用于给对象的数据进行初始化
    *
    * */

    private String name;
    private int age;
    //如果类中没有编写任何构造方法，系统会默认提供一个无参数的构造方法
//    public Student(){}
    //如果写了构造方法，系统不会再提供默认的构造方法
    //建议写上无参数和有参数的构造方法-- 方法的重载
    public Student(){}
    public Student(String name,int age){
        this.name = name;
        this.age = age;

        System.out.println("我是构造方法！！");
    }

    public void show(){
        System.out.println(name+"--"+age);
    }

}

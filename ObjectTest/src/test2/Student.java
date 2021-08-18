package test2;
/*
*this 关键字 可以调用本类的成员 解决局部变量和成员变量的方法
* 注意！：如果要使用成员变量和成员方法的时候使用this关键字 --方法被哪个对象调用，this就代表哪个对象
* */
public class Student {
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name; // return this.name
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }


    public void show(){
        System.out.println(name+"--"+age);
    }
}

package Object;
//没有继承关系的类，会默认继承Object

/*
1.object类是所有类的直接或者间接父类
2.直接打印一个对象就是打印这个对象的toString方法的返回值
3.Object类的toString方法得到的是对象的地址值
4.我们一般会对toString方法进行重写
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

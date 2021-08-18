package OOPtest;

//创建类的对象=类的实例化=实例化类
//1.创建类，设计类的成员
//2. 创建类的对象
//3.通过”对象.属性“或者”对象.方法“调用对象的结构
public class PersonTest {
    public static void main(String[] args) {
        //创建Person类的对象
        Person p1 = new Person();
        //调用对象的结构，属性和方法
        p1.name = "TOM";
        p1.isMale=true;
        System.out.println(p1.name);

        //调用方法
        p1.eat();
        p1.sleep();
        p1.talk("英语");

        //************************//
        //如果创建了一个类的多个对象，那么每个对象都独立拥有一套类的属性
        Person p2 = new Person();
        System.out.println(p2.name);// null?
        System.out.println(p2.isMale);
        //将p1对象的地址值赋给了P3，导致了p1，p3指向了堆空间的同一个实体对象。
        Person p3 =p1;
        System.out.println(p3.name);
        p3.age=10;
        System.out.println(p1.age);
    }
}


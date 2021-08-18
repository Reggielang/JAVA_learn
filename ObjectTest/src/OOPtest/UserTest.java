package OOPtest;/*
* 属性（成员变量）VS  局部变量
*相同点
*定义变量的格式，都相同。
* 变量都是先声明后使用
* 变量都有对应的作用域
*
* 不同点
*在类中声明的位置不同
* 属性：直接定义在类的一对{}内
* 局部变量：声明在方法内、方法形参、代码块内、构造器内的变量
*
* 关于权限修饰符的不用
* 属性，可以在声明时，指明其权限
* 常用的权限修饰符：private public protected
*
*
*
*默认初始化值的情况
* 属性：类的属性根据其类型都有默认初始化值
* 整型（byte，short，int long）0
* 浮点型（double，float）0.0
* 字符型（char）0或者‘\u0000’
* 布尔型（Boolean） false
*
* 引用数据类型：类，数组，接口 null
*
* 局部变量：没有默认初始化值 -- 方法中的变量
* 意味着，调用局部变量之前，必须要显式赋值
*特别的：形参在调用时，进行赋值就可以
*
*在内存的加载位置
* 属性 加载到堆空间中
* 局部变量 加载到栈空间
*
*成员变量-- 类中方法外的变量
*
*
* */

public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.name);
        System.out.println(u1.age);
        System.out.println(u1.isMale);
        u1.talk("日语");
    }
}


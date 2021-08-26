package lambda6;
/*
省略写法规则；
参数类型可以省略，多个参数情况下，不能省略一个
如果参数只有一个，那么小括号可以省略
如果代码块的语句只有一句，可以省略大括号和分号，甚至是return

lambda表达式和匿名内部类的区别
1.匿名内部类--可以是接口，抽象类，或者具体类
2.lambda-- 只能是接口

如果接口中有且只有一个抽象方法，那么可以使用lambda表达式，也可以使用匿名内部类
如果接口中有多个抽象方法，那只能使用匿名内部类
 */
public class test {
    public static void main(String[] args) {
        //lambda实现
//        useInter((double a,double b)->{return a+b;});
        useInter((a,b)->a+b);
    }
    public static void useInter(Inter i){
        double result = i.method(12.3,22.3);
        System.out.println(result);
    }
}

interface Inter{
    double method(double a,double b);
}
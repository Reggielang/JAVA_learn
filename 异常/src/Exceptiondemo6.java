import java.util.Scanner;

public class Exceptiondemo6 {
    public static void main(String[] args) {
/*
1.如果try中没有遇到问题，怎么执行？ -- 会把try中所有的代码都执行，不会执行catch的代码

2.如果try中遇到了问题，那么try下面的代码还会执行么 -- 直接跳转到对应的catch语句中，try下面的代码就不会再执行了。
当catch里面的语句全部执行完毕，就表示整个体系全部执行完毕，继续执行下面的代码

3.如果出现的问题没有被捕获，那么程序如何运行？
那么try...catch...等于没有写，没有任何处理，默认交给虚拟机处理

4.同时出现多个异常怎么处理？
出现多个异常，就可以写多个catch，如果多个异常之间存在子父类关系，那么父类一定要写在下面

 */
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的年龄；");
            String line = sc.nextLine();
            int age = Integer.parseInt(line); //格式化异常
            System.out.println(age);
            System.out.println("测试123");
//            System.out.println(2/0); //数学运算异常
        } catch (NumberFormatException e) {
            System.out.println("格式化异常出现了");
        }catch (ArithmeticException e) {
            System.out.println("数学运算异常出现");
        }
            System.out.println("测试456");
    }
}

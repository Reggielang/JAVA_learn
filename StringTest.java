//String 类型变量使用
//string属于引用数据类型
//声明string类型使用一对“”
//string 可以和八种基本数据类型做运算，且运算只能是连接运算
//运算的结果仍然是string类型

public class StringTest {
    public static void main(String[] args){
        String s1 = "Hello World!";
        System.out.println(s1);


        int number = 1001;
        String numberstr = "学号： ";
        String info = numberstr +number; //连接运算
        System.out.println(info);

        //练习
        char c = 'a';
        int num = 10;
        String str = "hello";
        System.out.println(c+num+str); //107hello
        System.out.println(c+str+num); //ahello10
        System.out.println(c+(num+str)); //a10hello
        System.out.println((c+num)+str); // 107hello
        System.out.println(str+num+c); // hello10a


        //练习
        //* *
//        System.out.println("* *");
        System.out.println('*'+'\t'+'*');
        System.out.println('*'+"\t"+'*');

    }
}

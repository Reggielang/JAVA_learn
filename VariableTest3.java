//基本数据类型之间的运算规则
//前提：这里只讨论7种数据类型的转换，不包含Boolean类型的
//1. 自动类型转换
//当容量小的数据类型变量与容量大的数据类型做运算，结果自动提升为容量大的数据类型
// 容量的大小指的是 表示数的范围的大小 float容量大于long的容量
//byte -- short --int -- long -- float --double
//当 byte char short 三种类型的变量做运算，结果都是int类型

//2. 强制类型转换


public class VariableTest3 {
    public static void main(String[] args){
        byte b1 = 2;
        int i1 = 12;
        int b2 = b1+i1;
        System.out.println(b2);


        float f = b1+i1;
        System.out.println(f);


        short s1 =123;
        double d1 = s1;
        System.out.println(d1); //123.0



        char c1 = 'a';
        int i3 = 10;
        int i4 = c1+i3;
        System.out.println(i4);


    }


}

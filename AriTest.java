//算术运算符
//+ - * / % 前（++） 后（++） 前（--） 后（--）


public class AriTest {
    public static void main(String[] args){
        int num1 =12;
        int num2 = 5;
        int result1 = num1/num2;
        System.out.println(result1);

        int result2 = num1/num2*num2;//10 从前往后顺序进行计算

        double result3 =num1/num2;
        System.out.println(result3);//2.0

        double result4  =num1/num2; //2.0
        System.out.println(result4);

        double result5  =num1/(num2+0.0);//2.4
        System.out.println(result5);

        double result6  = (double)num1/num2;//2.4
        System.out.println(result6);

//        取余运算
//        结果的符号与被摸数的符号相同
        int m1=12;
        int n1 = 5;
        System.out.println(m1%n1);


//        前后（++） 前++ 先自增1，然后再运算，  后++ 先运算后自增1
        int a1 = 10;
        int b1 = ++a1;
        System.out.println("a1 = "+ a1+" , b1="+b1);

        int a2 = 10;
        int b2 = a2++;
        System.out.println("a2 = "+ a2+" , b2="+b2);


//        注意点
        short s1 =10;
        //s1 = s1+1 编译失败
        //s1 = (short)(s1+1);//正确的
        s1++; //不会因为自增1 改变本身变量的数据类型


        //        前后（--） 前-- 先自减1，然后再运算，  后-- 先运算后自减1
        int a4 =10;
        int b4 = --a4;
        int b5 = a4--;
        System.out.println("a4 = "+ a4+" , b4="+b4);


        //练习
        int num  = 189;
        int bai = num/100;
        int shi = num%100/10;
        int ge = num%10;

        System.out.println("百位数："+bai);
        System.out.println("十位数："+shi);
        System.out.println("个位数："+ge);

    }
}

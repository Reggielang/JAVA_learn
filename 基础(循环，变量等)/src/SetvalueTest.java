//赋值运算符
//+= -= /= %= *=

//逻辑运算符
// & && | || ! ^
//逻辑运算符都是操作Boolean类型的变量

//比较运算符
// == !=  >= <=  > < instanceof

//位运算符 (都是对2进制的计算)
//操作的都是整形的变量
//<< 在一定范围内每向左1位，相当于*2
//>> 在一定范围内每向右1位，相当于/2

//三元运算符
//(条件表达式)? 表达式1： 表达式2
//条件表达式结果为Boolean类型，根据条件表达式的真或者假 决定执行表达式1或表达式2
//如果表达式为True，则执行表达式1，为false则执行表达式2
//表达式1和表达式2 要求是一致的，统一类型
//可以嵌套三元运算符

//凡是可以使用三元运算符的地方，都可以改写为if else 反之，不成立

//面试题：最高效的方式计算2*8？ 2<<3 或者8<<1
public class SetvalueTest {
    public static void main(String[] args){
        //区分 & 和 &&
        //相同点： & 和&&运算结果相同的、 当符号左边是true时，二者都会执行符号右边的运算
        //不同点： 当符号左边为false时，&继续执行符号右边的运算，&&不再执行符号右边的运算
        boolean b1 =true;
        b1 = false;
        int num1 = 10;
        if(b1&(num1++>0)){
            System.out.println("我在北京");
        }else{
            System.out.println("我在南京");
        }

        System.out.println("num1 = "+num1);

        boolean b2 =true;
        b2 = false;
        int num2 = 10;
        if(b2&&(num2++>0)){
            System.out.println("我在北京");
        }else{
            System.out.println("我在南京");
        }

        System.out.println("num2 = "+num2);

        // 区别   |与||
        //相同点，二者运算结果相同、当符号左边为false时，二者都会执行符号右边的运算
        //不同：当符号左边为true时，|继续执行符号右边的运算，||不会执行
        // 开发中推荐用||
        boolean b3 =true;
        b3 = false;
        int num3 = 10;
        if(b3|(num3++>0)){
            System.out.println("我在北京");
        }else{
            System.out.println("我在南京");
        }
        System.out.println("num3 = "+num3);

        boolean b4 =true;
        b4 = false;
        int num4 = 10;
        if(b4||(num4++>0)){
            System.out.println("我在北京");
        }else{
            System.out.println("我在南京");
        }
        System.out.println("num4 = "+num4);


//        获得两个整数的最大值
        int m=12;
        int n = 5;

        int max = (m>n)? m:n;
        System.out.println(max);

        //(m>n)? 2:"n大"; 编译错误

        String maxnum = (m>n)? "m大":"n大";
        System.out.println(maxnum);

        String maxnum2 = (m>n)? "m大":((m==n)? "相等": "n大");


        //获取三个数的最大值
        int n1 = 12;
        int n2 = 30;
        int n3 = -43;

        int max1 = (n1>n2)? n1:n2;
        int max2 = (max1>n3)? max1:n3;
        System.out.println(max2);

    }
}

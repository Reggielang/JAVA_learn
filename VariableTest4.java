//强制类型转换
//自动类型提升的逆运算


// 需要使用强转符： （） 需要在被转变量前加入强转符，括号内输入新的类型
//强制类型转换，可能会导致精度损失。


public class VariableTest4 {
    public static void main(String[] args){
        double d1 = 12.9;

        //强制类型转换
        int i1 = (int)d1; //截断操作
        System.out.println(i1);

        //精度损失
        int i2 = 128;
        byte b = (byte) i2;
        System.out.println(b);

        long l = 1234141;
        System.out.println(l);

        //过大的整数 编译失败
        //long l = 1231222222222213;

        //编译失败
        //float f1 = 12.3;

        //整型常量默认为int型， 浮点型常量默认为float型

        byte  b2 = 12;
//        byte b1 = b2+1;
//        float f1 = b+12.3;




    }
}

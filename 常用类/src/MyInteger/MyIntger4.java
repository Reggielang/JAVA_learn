package MyInteger;

/*
基本数据类型包装类最常见操作就是用于基本数据类型和字符串之间的转换
 */
public class MyIntger4 {
    public static void main(String[] args) {

        String s1 = "100";
        int i1 = 200;
        System.out.println(s1+i1); //字符串+任意数据类型，结果都是字符串!!!

        //String--int 调用Integer的parseInt方法
        int i2 = Integer.parseInt(s1); //字符串类型的整数变为int类型的整数
        System.out.println(i2+i1);

        //int --String
        //方式1
        int i3 =100;
        String s2 = i3+"";
        System.out.println(s2+100);

        //方式2-调用String的valueof方法
        String s3 = String.valueOf(i3);
        System.out.println(s3+100);


    }
}

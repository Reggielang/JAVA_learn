package MyBigDecimal;

import java.math.BigDecimal;

public class MyBigDecimaldemo {
    public static void main(String[] args) {
        //加 减 乘 除
        //如果想要进行精确运算，要使用字符串构造
//        BigDecimal s1 = new BigDecimal(0.1);
//        BigDecimal s2 = new BigDecimal(0.2);
        BigDecimal s1 = new BigDecimal("0.1");
        BigDecimal s2 = new BigDecimal("0.2");

        BigDecimal add = s1.add(s2);
        System.out.println(add);

        BigDecimal sub = s1.subtract(s2);
        System.out.println(sub);

        BigDecimal mul = s1.multiply(s2);
        System.out.println(mul);

        BigDecimal div = s1.divide(s2);
        System.out.println(div);
    }
}

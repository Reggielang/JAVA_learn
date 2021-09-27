package MyBigDecimal;

import java.math.BigDecimal;
/*
用来精确计算的
建议使用字符串的构造方法
除法除不尽，使用三个参数的除法
 */
public class MyBigDecimaldemo2 {
    public static void main(String[] args) {
        BigDecimal s1 = new BigDecimal("10.0");
        BigDecimal s2 = new BigDecimal("3.0");
//        BigDecimal div = s1.divide(s2);
//        System.out.println(div);

        //参数1，参与计算的第二个对象，参数2，表示小数点精确到几位，参数3，舍入模型 -- 进一法，去尾法，四舍五入
        BigDecimal div = s1.divide(s2,2,BigDecimal.ROUND_FLOOR);
        System.out.println(div);
    }
}

package Objects;

import java.util.Objects;

public class MyObjectsdemo {
    public static void main(String[] args) {
        // public static String toString(对象) //返回参数中的字符串表现形式
        Student s = new Student("小罗同学",22);
        String result = Objects.toString(s);
        System.out.println(result);

        // public static String toString(对象，默认字符串) 返回对象的字符串表现形式
        //如果对象为空返回默认的字符串
        //Student s2 = new Student("小花同学",23);
        //Student s = null;
//        String result2 = Objects.toString(s2, "随便写一个");
//        System.out.println(result2);

        //public static Boolean isNull(对象)  判断对象是否为空
//        Student s3 = null;
//        boolean result3 = Objects.isNull(s3);
//        System.out.println(result3);

        //public static Boolean noNull(对象) 判断对象是否不为空

        Student s4 = new Student();
        boolean result4 = Objects.nonNull(s4);
        System.out.println(result4);

    }
}

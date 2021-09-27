package Object3;

public class InterviewTest {
    public static void main(String[] args) {
        String s1 = "abc";
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(s1.equals(sb)); //false
        //1.此时调用的是String类中的equals方法
        //保证参数也是字符串，否则不会比较属性值，直接返回false

        //StringBuilder没有equals方法，用的父类object类的方法，就是比较的地址值
        System.out.println(sb.equals(s1)); //false
    }
}

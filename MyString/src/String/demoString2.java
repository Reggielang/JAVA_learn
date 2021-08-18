package String;

public class demoString2 {
    public static void main(String[] args) {
        String s1 = new String(); //空白的字符串对象
        System.out.println(s1);

        char[] chs = {'a','b','c'};
        String s2 = new String(chs);
        System.out.println(s2);


        String s3 = new String("123");
        System.out.println(s3);

    }
}

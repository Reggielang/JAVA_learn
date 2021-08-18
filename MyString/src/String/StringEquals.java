package String;

public class StringEquals {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "Abc";
        String s3 = "abc";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        //忽略大小写
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}

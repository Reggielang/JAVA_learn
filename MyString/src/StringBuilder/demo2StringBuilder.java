package StringBuilder;

public class demo2StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // 空的
        System.out.println(sb);

        //根据字符串内容，来创建可变字符串对象
        StringBuilder sb2 = new StringBuilder("abc");
        System.out.println(sb2);
    }
}

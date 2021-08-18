package String;
//Java程序中，所有双引号的字符串，都是String类的对象
//字符串是常量，他们的值在创建之后不能更改
// 虽然String的值不可变，但他们可以被共享因为创建了一个字符串会存在于字符串常量池中。
//==比较
//基础类型；比较的是数据值是否相同，引用类型；比较的是地址值书否相同
public class demoString {
    public static void main(String[] args) {
        String s1 = "abc";
        int length = s1.length();
        System.out.println(length);

        s1= "def" ;//这是让s1记录了一个新的对象，不是更改了字符串
    }
}

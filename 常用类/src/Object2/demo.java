package Object2;

public class demo {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("zhangsan",23);

        System.out.println(s1==s2); //false == 比较的是地址值
        //object类的的equals方法 也是 == 需要重写equals方法
        System.out.println(s1.equals(s2)); //false

    }
}

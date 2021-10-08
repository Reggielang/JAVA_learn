package Set;
/*
HashSet
哈希值
是JDK根据对象的地址或者属性值，算出来的int类型的整数

结论：如果hashSet要存储自定义对象，一定要重写hashCode以及equals方法

 */

import java.util.HashSet;

public class HashSetdemo3 {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        Student s1 = new Student("张三",23);
        Student s2 = new Student("张三",23);
        Student s3 = new Student("小妹",22);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);

        for (Student s : hs) {
            System.out.println(s);
        }
    }

}

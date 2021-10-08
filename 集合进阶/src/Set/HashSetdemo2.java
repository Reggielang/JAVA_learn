package Set;
/*
HashSet
哈希值
是JDK根据对象的地址或者属性值，算出来的int类型的整数

 */

import java.util.HashSet;
import java.util.Iterator;

public class HashSetdemo2 {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        Student s1 = new Student("张三",23);
        Student s2 = new Student("小妹",22);

        //因为在Object类中，是根据对象的地址值计算出的哈希值
        System.out.println(s1.hashCode());//460141958
        System.out.println(s1.hashCode());//460141958

        System.out.println(s2.hashCode());//1163157884
    }

}

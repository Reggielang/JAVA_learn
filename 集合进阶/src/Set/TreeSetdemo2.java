package Set;

import java.util.TreeSet;

/*
TreeSet --不包含重复元素，而且也没有带索引的方法.
!!可以将元素按照规则进行排序!!
想要使用TreeSet，必须指定排序的规则
 */
public class TreeSetdemo2 {
    //存储自定义类并遍历
    public static void main(String[] args) {

        Student s1 = new Student("zhangsan",16);
        Student s2 = new Student("lisi",12);
        Student s3 = new Student("wangwu",28);
        Student s4 = new Student("zhaoliu",28);
        Student s5 = new Student("qianqi",28);

        TreeSet<Student> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        System.out.println(ts);


    }
}

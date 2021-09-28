package Collection;

import java.util.ArrayList;
import java.util.Iterator;

/*
增强for,简化数组和Collection集合的遍历
 */
public class Collectiondemo6 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("张三",22);
        Student s2 = new Student("张四",22);
        Student s3 = new Student("张五",22);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        //迭代器
        Iterator<Student> it = list.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s);
        }
        System.out.println("-------------------");
        //增强for
        for (Student student : list) {
            System.out.println(student);
            
        }


    }
}

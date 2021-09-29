package Set;

import java.util.Comparator;
import java.util.TreeSet;

/*
比较器排序Comparator的使用

自然排序：自定义类要实现Comparable接口，重写CompareTo方法，根据返回值排序
比较器排序：创建TreeSet对象时，传递Comparator的实现对象，重写compare方法，根据返回值排序
 */
public class TreeSetdemo3 {
    //存储自定义类并遍历
    public static void main(String[] args) {

        Teacher t1 = new Teacher("zhangsan",16);
        Teacher t2 = new Teacher("lisi",12);
        Teacher t3 = new Teacher("wangwu",28);
        Teacher t4 = new Teacher("zhaoliu",28);
        Teacher t5 = new Teacher("qianqi",28);

        TreeSet<Teacher> ts = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                //o1表示现在要存入的元素，o2表示已经存入在集合中的元素
                //主要条件
                int result = o1.getAge()-o2.getAge();
                //次要条件
                result = result ==0 ? o1.getName().compareTo(o2.getName()):result;
                return result;

            }
        });
        ts.add(t1);
        ts.add(t2);
        ts.add(t3);
        ts.add(t4);
        ts.add(t5);

        System.out.println(ts);


    }
}

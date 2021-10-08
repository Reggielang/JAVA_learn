package Map;

import java.util.Comparator;
import java.util.TreeMap;

/*
TreeMap底层是红黑树结构
依赖自然排序或者比较器排序，对键排序
如果键是自定义的对象，需要实现comparable接口或者在创建TreeMap对象时候给出比较器排序规则

 */
public class Treemapdemo {
    public static void main(String[] args) {
        TreeMap<Student, String> tm = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();
                result=result==0?o1.getName().compareTo(o2.getName()):result;
                return result;
            }
        });
        Student s1 = new Student("小黑",22);
        Student s2 = new Student("小红",21);
        Student s3 = new Student("小名",23);

        tm.put(s1,"四川");
        tm.put(s2,"江苏");
        tm.put(s3,"南京");

        tm.forEach((Student key,String value)->{
            System.out.println(key+"----------"+value);
        });
    }
}

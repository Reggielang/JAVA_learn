package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapdemo3 {
    public static void main(String[] args) {
        HashMap<Student,String> hm = new HashMap<>();

        Student s1 = new Student("小黑",23);
        Student s2 = new Student("大鹏",22);
        Student s3 = new Student("小美",21);

        hm.put(s1,"江苏");
        hm.put(s2,"北京");
        hm.put(s3,"四川");

        //第一种遍历，先获取键，在通过键来找到对应的值
        Set<Student> keys = hm.keySet();
        for (Student key : keys) {
            String value = hm.get(key);
            System.out.println(key+"----"+value);
        }
        System.out.println("============");
        //第二种遍历 先获取到所有的键值对对象，再获取到里面的每一个键和每一个值
        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"-----"+value);
        }
        System.out.println("============");
        //第三种
        hm.forEach((Student key,String value)->{
            System.out.println(key+"-----"+value);
        });


    }
}

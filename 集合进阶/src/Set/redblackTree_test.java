package Set;

import java.util.TreeSet;

/*

            
 */
public class redblackTree_test {
    //存储字符串并遍历
    public static void main(String[] args) {
        TreeSet<Student2> ts = new TreeSet<>();
        Student2 s1 = new Student2("dahei",80,80,80);
        Student2 s2 = new Student2("xiaohong",90,90,90);
        Student2 s3 = new Student2("xiaoming",100,100,100);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        for (Student2 t : ts) {
            System.out.println(t);
        }
    }
}

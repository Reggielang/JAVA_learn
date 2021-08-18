package test3;

public class StudentTest {
    public static void main(String[] args) {
        Student s1  = new Student();
        s1.setAge(23);
        s1.setName("张三");
        s1.show();


        Student s2 = new Student("李四",28);
        s2.show();

    }
}

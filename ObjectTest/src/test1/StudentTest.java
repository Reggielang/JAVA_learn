package test1;

public class StudentTest {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "张三";
        //stu.age = 23;
        stu.setAge(-23);

        stu.show();
    }
}

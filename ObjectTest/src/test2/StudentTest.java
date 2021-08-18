package test2;

public class StudentTest {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("李四");
        stu.setAge(24);
        System.out.println(stu.getAge());
        System.out.println(stu.getName());
        // get方法才是拿到了age这个值，可以进行后续处理
        int age =stu.getAge();

        for (int i =0;i<=age;i++){
            System.out.println("生日快乐");
        }


        stu.show(); // 仅仅是展示数据

    }
}

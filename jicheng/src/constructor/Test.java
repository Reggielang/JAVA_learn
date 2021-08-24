package constructor;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student("张三",23,100);
        System.out.println(stu1.getName()+"--"+stu1.getAge()+"--"+stu1.getScore());

    }
}

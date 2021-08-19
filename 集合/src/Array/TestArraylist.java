package Array;
import domain.Student;

public class TestArraylist {
    public static void main(String[] args) {
        //动态化长度为3的数组，类型为student类型
        Student[] arr = new Student[3];
        //创建三个学生的对象
        Student stu1 = new Student("张三",23);
        Student stu2 = new Student("王五",24);
        Student stu3 = new Student("李四",25);

        //将学生对象存入数组
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //遍历数组，取出对象
        for (int i = 0; i < arr.length; i++) {
            //用student类型，接收这个取出来的student对象
           Student temp = arr[i];
            System.out.println(temp.getName()+"--"+temp.getAge());
        }


    }
}

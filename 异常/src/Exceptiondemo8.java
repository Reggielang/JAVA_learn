import java.util.Scanner;

public class Exceptiondemo8 {
    public static void main(String[] args) {
        //键盘录入数据，超出正常范围，需要再次录入
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.println("请输入姓名");
        String name = sc.nextLine();
        s.setName(name);


        while (true){
            System.out.println("请输入年龄");
            String agestr = sc.nextLine();
            try {
                int age = Integer.parseInt(agestr);
                s.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("请输入一个整数");
                continue;
            }catch (AgeOutofBoundsException e) {
                System.out.println(e.toString());
                System.out.println("请输入一个范围内的年龄");
            }

//            if (age>=18&&age<=25){
//                s.setAge(age);
//                break;
//            }else {
//                System.out.println("请输入符合要求的年龄");
//                continue;
//            }

        }

        System.out.println(s);
    }
}

package test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //1.用户名和密码

        String username = "admin";
        String pwd = "123456";


        // 输入用户名和密码
        Scanner sc = new Scanner(System.in);

        for (int i=1;i<=3;i++){
        System.out.println("请输入用户名：");
        String scuser = sc.nextLine();
        System.out.println("请输入密码：");
        String scpwd = sc.nextLine();

        if (username.equals(scuser)&&pwd.equals(scpwd)){
            System.out.println("登陆成功");
            break;
        }else {
            if (i==3){
                System.out.println("你的登陆次数上限了，请明天再来");
            }else{
            System.out.println("登陆失败,你还剩余"+(3-i)+"次机会");
        }
    }
        }
    }
}

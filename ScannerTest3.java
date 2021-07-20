//if else 可以互相嵌套

//获取随机数的公式：
// [a,b] =(int)(Math.random()*(b-a+1)+a)
import java.util.Scanner;
public class ScannerTest3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int num1 = scan.nextInt();
        System.out.println("请输入第二个整数：");
        int num2 = scan.nextInt();
        System.out.println("请输入第三个整数：");
        int num3 = scan.nextInt();

        if (num1>num2){
            if(num3>num1){
                System.out.println(num2+","+num1+","+num3);
            }else if(num3<num2){
                System.out.println(num3+","+num2+","+num1);
            }else{
                System.out.println(num2+","+num3+","+num1);
            }
        }else {
            if(num3>num2){
                System.out.println(num1+","+num2+","+num3);
            }else if (num3<num1){
                System.out.println(num3+","+num1+","+num2);
            }else {
                System.out.println(num1+","+num3+","+num2);
            }
        }
    }
}
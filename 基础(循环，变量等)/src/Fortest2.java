//求两个正整数的最大公约数和最小公倍数。
import java.util.Scanner;
public class Fortest2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个正数：");
        int m = scan.nextInt();
        System.out.println("请输入一个正数：");
        int n = scan.nextInt();
//获取最大公约数
        int min =(m<n)? m:n;
        for (int i=min;i>=1;i--){
            if (m%i==0&&n%i==0){
                System.out.println(i);
                break; //一旦再循环中执行到break，就会跳出循环
            }
        }
// 获取最小公倍数
        int max=(m>n)?m:n;
        for (int i = max;i<=m*n;i++){
            if (i%m==0&&i%n==0){
                System.out.println(i);
                break;
            }
        }
    }
}

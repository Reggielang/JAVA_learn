//从键盘输入一个不确定的整数，并判断读入的正数和负数的个数，输入为0的时候，程序结束
//不在循环条件部分限制次数的结构：for(;;)和while(true)
//方式1循环条件部分返回false
//方式2在循环体中加入break

import java.util.Scanner;
public class ForWhileTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //记录正负数的个数
        int positivenumer=0;
        int negativenumer =0;

        while (true){
            int num = scan.nextInt();
            //判断输入数的正负
            if (num>0){
                positivenumer++;

            }else if(num<0){
                negativenumer++;
            }else {
                break;
            }
        }
        System.out.println("正数个数为"+positivenumer+" 负数个数为"+negativenumer);

    }
}

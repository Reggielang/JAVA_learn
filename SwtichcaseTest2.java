//凡是可以使用switchcase的结构，都可以转换成ifelse，反之，不成立
import java.util.Scanner;
public class SwtichcaseTest2 {
    public static void main(String[] args){

        int score = 78;
//        switch (score){
//            case 0:
//
//            case 1:
//                ...
//        }
//        if (score>=60){
//            System.out.println();
//        }else{
//
//        }
//        如果switchcase中的多个case执行语句相同，可以合并
        switch (score/10){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("及格");
                break;
        }
            Scanner scan = new Scanner(System.in);
            System.out.println("请输入2019年的月份");
            int month = scan.nextInt();
            System.out.println("请输入2019年的天数");
            int day = scan.nextInt();

            //定义一个变量来保存总天数
            int sumdays = 0;
//            switch (month){
//                case 1:
//                    sumdays=day;
//                    break;
//                case 2:
//                    sumdays=31+day;
//                    break;
//                    ...
//            }
//break在switchcase中是可选的
            switch (month){
                case 12:
                    sumdays+=30;
                case 11:
                    sumdays+=31;
                case 10:
                    sumdays+=30;
                case 9:
                    sumdays+=31;
                case 8:
                    sumdays+=31;
                case 7:
                    sumdays+=30;
                case 6:
                    sumdays+=31;
                case 5:
                    sumdays+=30;
                case 4:
                    sumdays +=31;
                case 3:
                    sumdays += 28;
                case 2:
                    sumdays += 31;
                case 1:
                    sumdays+=day;
            }
            System.out.println("2019年"+month+"月"+day+"日是当年的第"+sumdays+"天");
//考虑是否是闰年的问题
        System.out.println("请输入年份");
        int year = scan.nextInt();
        System.out.println("请输入月份");
        int month2 = scan.nextInt();
        System.out.println("请输入天数");
        int day2 = scan.nextInt();
        int sumdays2 = 0;
        switch (month){
            case 12:
                sumdays2+=30;
            case 11:
                sumdays2+=31;
            case 10:
                sumdays2+=30;
            case 9:
                sumdays2+=31;
            case 8:
                sumdays2+=31;
            case 7:
                sumdays2+=30;
            case 6:
                sumdays2+=31;
            case 5:
                sumdays2+=30;
            case 4:
                sumdays2 +=31;
            case 3:
                if ((year%4==0&& year%100==0)||year%400 ==0){
                    sumdays2 += 29;
                }else {
                    sumdays2 += 28;
                }
//
            case 2:
                sumdays2 += 31;
            case 1:
                sumdays2+=day2;
        }
        System.out.println(year+"年"+month2+"月"+day2+"日是当年的第"+sumdays2+"天");
    }
}

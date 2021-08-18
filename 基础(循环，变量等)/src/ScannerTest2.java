//针对多个条件表达式
//如果多个条件表达式之间没有关系，那条件表达式之间的顺序没有作用
//如果多个条件表达式之间存在交集关系，那么需要根据实际情况，考虑清楚，应该将哪个条件表达式声明在上面
//如果多个条件表达式之间存在包含关系，那么需要把范围小的条件表达式写上面


import java.util.Scanner;
public class ScannerTest2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入你的成绩：");
        int Score = scan.nextInt();

        if(Score==100){
            System.out.println("奖励一辆BMW");
        }else if (Score>80&&Score<=99){
            System.out.println("奖励一个iPhone手机");
        }else if(Score>=60&&Score<=80){
            System.out.println("奖励一个iPad");
        }else {
            System.out.println("啥也没有");
        }
    }
}

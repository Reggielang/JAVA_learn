import java.util.Scanner;
public class Arraydemo2 {
    public static void main(String[] args) {
//        使用Scanner读取学生个数
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        int number = scan.nextInt();
//        创建数组，储存学生成绩，动态初始化
        int[] Score = new int[number];

//        遍历数组，给数组元素赋值
//        获取数组中元素的最大值
        int maxScore = 0;
        System.out.print("请输入"+number+"个学生成绩！");
        for (int i =0;i<Score.length;i++){
            Score[i]=scan.nextInt();

            if (maxScore<Score[i]){
                maxScore=Score[i];
            }
        }

//        根据每个学生成绩与最高分的差值，得到每个学生的等级，并输出等级和成绩
        char level;
        for (int i =0;i<Score.length;i++){
            if (maxScore-Score[i]<=10){
            level='A';
            }else if(maxScore-Score[i]<=20){
                level='B';
            }else if(maxScore-Score[i]<=30){
                level='C';
            }else {
                level='D';
            }
            System.out.print(" student "+i+" Score is "+Score[i]+" level is "+level+"\n");
        }
    }
}

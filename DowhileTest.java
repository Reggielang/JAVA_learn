//do while循环结构
//        初始化条件
//do{
//循环体
//迭代条件
//        }while(循环条件);
//dowhile循环至少会执行一次循环体


public class DowhileTest {
    public static void main(String[] args){

        int num=1;
        int sum = 0;//记录总和
        int count=0;//记录个数
        do{
            if (num%2==0){
                System.out.println(num);
                sum+=num;
                count++;
            }
            num++;

        }while (num<=100);
        System.out.println("总和是"+sum);
        System.out.println("个数是"+count);
    }



}

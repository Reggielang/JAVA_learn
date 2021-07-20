//while 循环结构四要素
//初始化条件
//循环条件--Boolean
//循环体
//迭代条件

//初始化条件
//while(循环条件){
//循环体；
//        迭代条件；
//        }

//写while循环注意千万别丢了迭代条件
//for 和while能相互转换

public class WhileTest {
    public static void main(String[] args){
        //遍历100以内的所有偶数
        int i =1;
        while (i<=100){
            if (i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }
}

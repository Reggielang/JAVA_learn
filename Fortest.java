//循环结构的4个要素
//初始化条件、
// 循环条件（一定是布尔类型 boolean）、
// 循环体、
// 迭代条件

//for(初始化条件;循环条件;迭代条件){
//    循环体
//        }

//执行过程  初始化条件--（循环条件--循环体--迭代条件）

public class Fortest {
    public static void main(String[] args){
        for (int i=1;i<=5;i++){
            System.out.println("hello world!");
        }
//        练习
        int num=1;
        for (System.out.println('a');num<=3;System.out.println('c'),num++){
            System.out.println('b');
        }
//        遍历100以内的偶数,输出所有偶数的和,输出偶数的个数
        int sum=0;//记录所有偶数的和
        int count =0;//记录偶数的个数
        for (int i =1;i<=100;i++){
            if (i%2==0){
                System.out.println(i);
                sum+=i;
                count++;
            }
        }
        System.out.println(sum);
        System.out.println(count);
//        练习
        for (int i=1;i<=150;i++){
                System.out.println(i+" ");

                if (i % 3== 0){
                    System.out.println("foo ");
            }
                if (i%5==0){
                    System.out.println("biz ");
                }
                if (i%7==0){
                    System.out.println("baz ");
                }
        }
    }
}

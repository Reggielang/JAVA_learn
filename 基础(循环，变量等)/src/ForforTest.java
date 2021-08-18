//将一个循环结构A声明在另外一个循环结构B的循环体中
//
//外层循环-循环结构B
//内层循环-循环结构A

//内层循环结构遍历1遍，只相当于外层循环体执行了一次
//假设外层循环需要执行M次，内层循环需要执行N次，此时内层循环一共执行了M*N次




public class ForforTest {
    public static void main(String[] args){
        for(int j=1;j<=4;j++){
            for(int i=1;i<=6;i++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int j=1;j<=5;j++){
            for(int i=1;i<=j;i++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int j=1;j<=5;j++){
            for(int i=1;i<=5-j;i++){
                System.out.print("*");
            }
            System.out.println();
        }
//        99乘法表
        for(int j=1;j<=9;j++){
            for(int i=1;i<=j;i++){
                System.out.print(j+" * "+i+" = "+(i*j)+" ");
            }
            System.out.println();
        }
        //获取当前的时间毫秒数
        long start = System.currentTimeMillis();

//        100以内的质数
//        只能被自身和1整除的数 --从2开始到这个数-1为止，都不能被这个数整除
        //优化2 对本身是质数的自然数是有效的 100毫秒
        for (int i =2;i<=100000;i++){//遍历100以内的自然数
            boolean right = true;

            for(int j=2;j<=Math.sqrt(i);j++){//j被i除
                if (i%j == 0){
                    right=false;
                    break; //优化1 只对于非质数的自然数有效 1615毫秒
                }
            }
            if (right==true){
                System.out.println(i+" ");
            }
            //重置一下否则遇到不是质数的数就会断掉
//            right=true;
        }
        //获取当前的时间毫秒数
        long end = System.currentTimeMillis();
        System.out.println(end-start);





    }
}

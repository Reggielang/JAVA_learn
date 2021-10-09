/*
定义一个方法，求两个数的和
定义一个方法，求三个数的和
 */

public class Parameter1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;


        int sum = getSum(a, b);
        System.out.println(sum);
        int sum2 = getSum(a, b, c);
        System.out.println(sum2);
    }

    public static int getSum(int a,int b){
        return a+b;
    }
    public static int getSum(int a,int b,int c){
        return a+b+c;
    }
}

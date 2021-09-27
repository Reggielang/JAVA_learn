public class Factorial2 {
    public static void main(String[] args) {
        //求1-100的和
        int sum = getSum(100);
        System.out.println(sum);

/*
递归要有结束条件
 */
    }

    private static int getSum(int i) {
        //方法的作用 求1-i之间的和
        if (i==1){
            return 1;
        }else {
            return i+getSum(i-1);
        }
    }
}

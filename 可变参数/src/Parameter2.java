/*
定义一个方法，求两个数的和
定义一个方法，求三个数的和
定义一个方法，求N个数的和
 */

public class Parameter2 {
    public static void main(String[] args) {
        //在JDK5之前，会把所有数据都放在一个数组种
        //我们自己定义的方法，形参只要写一个数组就可以了

        int[] arr = {1,2,3,4,5};
        int sum1 = getSum(arr);
        System.out.println(sum1);

    }

    private static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        return sum;
    }
}

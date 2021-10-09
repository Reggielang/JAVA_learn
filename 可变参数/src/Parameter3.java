/*
可变参数
如果一个方法有多个参数，可变参数必须放在最后
 */

public class Parameter3 {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        System.out.println(arr);
        int sum = getSum(1, 2, 3, 4, 5);
        System.out.println(sum);
    }

    public static int getSum(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

}

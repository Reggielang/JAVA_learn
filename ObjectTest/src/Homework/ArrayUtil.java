package Homework;

public class ArrayUtil {
    //求数组最大值
    public int getMax(int[] arr){
        //求数组对最大值
        int maxnum =arr[0];
        for(int i=0;i<arr.length;i++){
            if (maxnum<arr[i]){
                maxnum=arr[i];
            }
        }
        return maxnum;
    }
    //求数组最小值
    public int getMin(int[] arr){
        //求数组对最小值
        int minmun = arr[0];
        for(int i=0;i<arr.length;i++){
            if (minmun>arr[i]){
                minmun=arr[i];
            }
        }
        return minmun;
    }
    public int getSum(int[] arr){
        //求数组元素总和
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    //求数组的平均数
    public int getAvg(int[] arr){
        return getSum(arr)/arr.length;
    }
    //反转数组
    public void reverse(int[] arr){
        //方法2
        for (int i=0,j= arr.length-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    //复制数组
    public int[] copy(int[] arr){
        int[] arr1 = new int[arr.length];
        for (int i=0;i<arr1.length;i++){
            arr1[i]=arr[i];
        }
        return arr1;
    }
    //数组排序
    public void sort(int[] arr){
        //冒泡排序
        for (int i =0;i< arr.length-1;i++){
            for (int j = 0; j< arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    //遍历数组
    public void print(int[] arr){
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }

    }
    //查找元素 --二分法查找
    public int getIndex(int[] arr, int num){
        //线性查找：
        boolean isFlag = true;
        for (int i =0;i< arr.length;i++){
            if (num==arr[i]){
                return i;
            }
        }
        return -1;
    }

}

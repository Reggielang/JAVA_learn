package BinarySearch;
/*
二分查找 前提条件是必须为有序数组
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int number =11;

        //1.要干什么， 二分查找
        // 2，我干这些事要什么， 数组 元素
        // 3.我干完了，要不要把结果返回给调用者 把索引返回给调用者
        int index = binarySearchForIndex(arr,number);
        System.out.println(index);
    }

    private static int binarySearchForIndex(int[] arr, int number) {
        //1.定义查找范围
        int min =0;
        int max =arr.length-1;
        //2.循环查找 min<=max
        while (min<=max){
            //3.计算出中间位置
            int mid = (min+max)/2;

            if (arr[mid]>number){
                //mid 指向的元素>number
                //表示查找的元素在左边
                max = mid -1;
            }else if(arr[mid]<number){
                //mid 指向的元素<number
                //表示查找的元素在右边
                min = mid+1;
            }else{
                //mid 指向的元素==number
                return mid;
            }
        }
        //如果min>max--表示元素不存在，直接返回-1
        return -1;
    }


}

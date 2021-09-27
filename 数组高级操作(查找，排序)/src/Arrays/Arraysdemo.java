package Arrays;

import java.util.Arrays;

public class Arraysdemo {
    public static void main(String[] args) {
//        public static String toString(int[] a) 返回指定数组的内容的字符串表现形式
        int[] arr = {3,2,4,6,7};
        System.out.println(Arrays.toString(arr));

//        public static void sort(int[] a) 按照数字顺序排列指定的数组
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

//        public static int binarySearch(int[] a,int key) 利用二分查找返回指定元素的索引
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        int index = Arrays.binarySearch(arr2,10);
        System.out.println(index);
        //1.数组必须要有序 2.如果查找的元素存在，那么返回的就是元素的索引 3.如果查找的元素不存在，那么返回（-插入点-1）

    }
}

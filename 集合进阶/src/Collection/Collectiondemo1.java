package Collection;

import java.util.ArrayList;
import java.util.Arrays;
/*
数组的长度不可变的，集合的长度是可变的
数组可以存储基本数据类型和引用数据类型
集合只能存储引用数据类型，或者基本数据类型的包装类
 */
public class Collectiondemo1 {
    public static void main(String[] args) {
        //数组可以存储基本数据类型，也可以存储引用数据类型
        int[] arr1 = {1,2,3};
        String[] arr2 = {"a","b","c"};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        System.out.println(list1);

        //集合只能存储引用数据类型，不能存储基本数据类型
        //如果集合一定要存储基本数据类型，那么可以存储基本数据类型的包装类
//        ArrayList<int> list2 = new ArrayList<int>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2);
    }
}

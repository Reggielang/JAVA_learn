package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*
数组的长度不可变的，集合的长度是可变的
数组可以存储基本数据类型和引用数据类型
集合只能存储引用数据类型，或者基本数据类型的包装类
 */
public class Collectiondemo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            if ("b".equals(s)){
                //指的是谁，就删除谁
                it.remove();
            }
        }
        System.out.println(list);
    }
}

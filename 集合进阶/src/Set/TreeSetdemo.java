package Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
TreeSet --不包含重复元素，而且也没有带索引的方法.
!!但是可以将元素按照顺序进行排序!!
 */
public class TreeSetdemo {
    //存储字符串并遍历
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(4);
        ts.add(3);
        ts.add(2);
        ts.add(1);

        System.out.println(ts);

    }
}

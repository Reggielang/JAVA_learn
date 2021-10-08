package Set;
/*
HashSet
底层数据结构是哈希表
不能保证存储和取出的顺序是完全一致的，没有带索引的方法，不能用普通for循环遍历
由于是set集合，所以元素是唯一的。

 */

import java.util.HashSet;
import java.util.Iterator;

public class HashSetdemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("hello");
        hs.add("world");
        hs.add("java");
        hs.add("java");
        hs.add("java");
        hs.add("java");


        Iterator<String> it = hs.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("=================");


        for (String h : hs) {
            System.out.println(h);
        }
    }

}

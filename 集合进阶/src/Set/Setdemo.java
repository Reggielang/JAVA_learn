package Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
List -可重复 ArrayList数组结构  LinkedList链表结构
Set - 不可重复 HashSet TreeSet

Set集合特点 ：
1.可以去重
2.存取顺序不一致
3.没有带索引的方法，不能使用普通FOR进行遍历，也不能通过索引来获取，删除Set里的元素
 */
public class Setdemo {
    //存储字符串并遍历
    public static void main(String[] args) {
        Set<String> set =  new TreeSet<>();
        set.add("ccc");
        set.add("aaa");
        set.add("aaa");
        set.add("bbb");
        set.add("ddd");

        for (int i = 0; i < set.size(); i++) {
            //Set集合是没有索引的，不能用普通for进行遍历获取元素
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("------------");

        for (String s : set) {
            System.out.println(s);
        }
    }
}

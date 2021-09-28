package List;

import java.util.Iterator;
import java.util.LinkedList;

/*
ArrayList底层是数组，查询快，增删慢
LinkedList底层是链表，查询慢，增删快
 */
public class LinkedListdemo2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

//        public void addFirst(E e) 在该列表开头插入指定元素
        list.addFirst("FFF");
        System.out.println(list);

//                public void addLast(E e) 将指定的元素追加到此列表的末尾
        list.addLast("ggg");
        System.out.println(list);

//                public E getFirst() 返回此列表的第一个元素
        String first = list.getFirst();
        System.out.println(first);

//                public E getLast() 返回此列表的最后一个元素
        String last = list.getLast();
        System.out.println(last);

//                public E removeFirst() 删除此列表的第一个元素
        String removeFirst = list.removeFirst();
        System.out.println(list);

//                public E removeLast() 删除此列表的最后一个元素
        String removeLast = list.removeLast();
        System.out.println(list);

    }
}

package List;

import java.util.Iterator;
import java.util.LinkedList;

/*
ArrayList底层是数组，查询快，增删慢
LinkedList底层是链表，查询慢，增删快
 */
public class LinkedListdemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("------------");

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}

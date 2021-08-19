package List;

import java.util.ArrayList;

public class demo2Arraylist {
    public static void main(String[] args) {
//        testRemove();
//        testSet();
//        testGet();
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");

        int len = list.size();
        System.out.println(len);
    }

    private static void testGet() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");

        String s = list.get(0);
        System.out.println(s);
    }

    private static void testSet() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");

        String s = list.set(0,"666");
        System.out.println(s);
        System.out.println(list);
    }

    private static void testRemove() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");

        boolean b1 = list.remove("abc");
        boolean b2 = list .remove("zzz");
        System.out.println(b1);
        System.out.println(b2);

        System.out.println(list);

        String s = list.remove(0);
        System.out.println(s);
        System.out.println(list);
    }
}

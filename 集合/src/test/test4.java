package test;

import java.util.ArrayList;

public class test4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("test");
        list.add("张三");
        list.add("李四");
        list.add("test");
        list.add("test");
        //注意：只能删除一个重复的元素
//        list.remove("test");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            //字符串比较要用equals
            if ("test".equals(s)){
                list.remove(i);
                //确保删除全部的test元素
                i--;
            }
        }
        System.out.println(list);
    }
}

package test;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");

        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            System.out.println(temp);
        }
    }
}

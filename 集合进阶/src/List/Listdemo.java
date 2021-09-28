package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listdemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

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

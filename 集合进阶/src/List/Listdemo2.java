package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listdemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
//        add(int index,E element) 在此集合中的指定位置插入指定的元素
        list.add(0,"qqq");//原来位置的元素会往后挪动
        System.out.println(list);

//                E remove(int index) 删除指定索引处的元素，返回被删除的元素
        String remove = list.remove(0);
        //在list集合中有两个删除方法，1.返回值表示当前元素是否删除成功
        //2删除指定索引的元素，返回值表示当前删除的元素
        System.out.println(remove);

//                E set(int index,E element) 修改指定元素处的元素，返回被修改的元素
        String set = list.set(0, "xxx");
        System.out.println(set);

//                E get(int index) 返回指定索引处的元素
        String get = list.get(0);
        System.out.println(get);

    }
}

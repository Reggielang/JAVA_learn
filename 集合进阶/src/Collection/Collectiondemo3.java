package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/*
Iterator 迭代器，集合的专用遍历方式
 */
public class Collectiondemo3 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        //获取迭代器对象，迭代器对象创建出来，默认指向集合的0索引位置
        Iterator<String> it = list.iterator();

        //利用迭代器里面的方法进行遍历
        System.out.println(it.hasNext()); //表示当前位置是否有元素可以被取出

        System.out.println(it.next()); // 1取出当前位置的元素 2将迭代器往后移动一个索引的位置
        //循环遍历
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}

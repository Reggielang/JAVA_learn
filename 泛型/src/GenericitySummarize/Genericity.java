package GenericitySummarize;

import java.util.ArrayList;
import java.util.Iterator;

/*
不写泛型的弊端
就会所有的数据都会认为是一个Object
泛型的好处：把运行时期的问题提到了编译时期，避免了强制类型转换
 */
public class Genericity {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        Iterator it = list.iterator();
        while (it.hasNext()){
            Object next = it.next();
//            next.length();
            System.out.println(next);
        }
    }
}

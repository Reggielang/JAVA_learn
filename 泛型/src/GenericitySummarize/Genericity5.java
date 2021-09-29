package GenericitySummarize;

import java.util.ArrayList;

/*
泛型方法
 */
public class Genericity5 {
    public static void main(String[] args) {
        ArrayList<String> list1 = addElement(new ArrayList<String>(), "a","b","c","d");
        System.out.println(list1);

        ArrayList<Integer> list2 = addElement(new ArrayList<Integer>(), 1, 2, 3, 4);
        System.out.println(list2);
    }
    public static <T> ArrayList<T> addElement(ArrayList<T> list, T t1, T t2, T t3, T t4){
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        return list;
    }

}

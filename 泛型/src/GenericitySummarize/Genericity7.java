package GenericitySummarize;

import java.util.ArrayList;

/*
<?>表示通配符表示元素未知的Arraylist，他的元素可以匹配任意类型
但是不能添加元素到Arraylist中，获取出来的也是Object类型
 */
public class Genericity7 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

        ArrayList<Number> list2 = new ArrayList<>();

        ArrayList<Object> list3 = new ArrayList<>();

        printlist(list1);
        printlist(list2);

        method1(list1);
        method1(list1);
//        method1(list3);


    }
    //表示传递进集合的类型，可以是Number类型，或者Number所有的子类类型
    private static void method1(ArrayList<? extends Number>  list) {

    }
    //表示传递进集合的类型，可以是Number类型，或者Number所有的父类类型
    private static void method2(ArrayList<? super Number> list) {
    }

    private static void printlist(ArrayList<?> list) {
    }

}

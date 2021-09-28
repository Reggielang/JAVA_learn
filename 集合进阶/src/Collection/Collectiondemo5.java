package Collection;

import java.util.ArrayList;
import java.util.Iterator;

/*
增强for,简化数组和Collection集合的遍历
 */
public class Collectiondemo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");

        //1.数据类型一定是集合或者数组中的元素类型
        //2.s仅仅是一个变量名而已，在循环的过程中，依次表示集合或者数组中的每一个元素
        //3.list就是要遍历的集合或者数组
        for (String s : list) {
            System.out.println(s);
        }

        //只是修改的第三方变量s,并没有真实的修改集合
        for (String s : list) {
            s = "q";
            System.out.println(s);
        }

    }
}

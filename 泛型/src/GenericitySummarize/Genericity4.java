package GenericitySummarize;

import java.util.ArrayList;
import java.util.Arrays;

/*
泛型方法
 */
public class Genericity4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        //将list集合转为一个数组 -如果是空参，返回的数组类型是Object类型
        Object[] objects = list.toArray();
        System.out.println(Arrays.toString(objects));

        String[] strings = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(strings));

    }

}

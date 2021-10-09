package Streamdemo;
/*
获取stream流：把数据放到stream流中
中间方法：一次操作完毕可以进行其他操作
终结方法：一个stream流只有一个终结方法，是最后一个操作

stream流获取方法
单列集合，集合对象直接调用stream()
双列集合，不能直接获取，需要间接获取，集合对象调用keySet().stream() 或 entrySet().stream()
数组，数组的帮助类Arrays.stream(数组名)
同种数据类型的多个数据：Stream.of(数据1，数据2，数据3...)

 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

public class Streamtest2 {
    public static void main(String[] args) {
        method1();


        method2();


        method3();


        method4();
    }

    private static void method4() {
        //同种类型的多个数据
        Stream.of(1,2,3,43,5,5,6,7).forEach(s-> System.out.println(s));
    }

    private static void method3() {
        //数组
        int[] arr = {1,2,3,4};
        Arrays.stream(arr).forEach(s-> System.out.println(s));
    }

    private static void method2() {
        //双列集合
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("zhangsan",23);
        hm.put("lisi",23);
        hm.put("wangwu",23);
        hm.put("qianqi",23);

        //双列集合不能直接获取stream流
        //要用keySet-获取所有的键，再把这个Set集合中所有的键放到流当中
        hm.keySet().stream().forEach(s -> System.out.println(s));

        //entrySet
        //先获取到键值对对象，再把set集合中的所有键值对对象放到流中
        hm.entrySet().stream().forEach(s -> System.out.println(s));
    }

    private static void method1() {
        //单列集合
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

//        Stream<String> stream = list.stream();
//        stream.forEach(s-> System.out.println(s));

        list.stream().forEach(s -> System.out.println(s));
    }
}

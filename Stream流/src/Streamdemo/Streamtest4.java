package Streamdemo;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Streamtest4 {
    public static void main(String[] args) {

//        ArrayList<String> list = new ArrayList<>(List.of("张三丰","张无忌","张翠山","王二虎","张良"));
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张翠山");
        list.add("王二虎");
        list.add("张良");

        //limit 截取指定参数个数
        list.stream().limit(2).forEach(s -> System.out.println(s));


        //skip 跳过指定参数个数
        list.stream().skip(2).forEach(s-> System.out.println(s));

        System.out.println("====================");
        //concat()合并了两个流
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("张三丰");
        list2.add("张无忌");
        list2.add("张翠山");
        list2.add("王二虎");
        list2.add("张良");
        list2.add("张良");
        list2.add("张良");
        list2.add("张良");

        Stream<String> stream1 = list.stream();
        Stream<String> stream2 = list2.stream();

//        Stream<String> stream3 = Stream.concat(stream1, stream2);
//        stream3.forEach(s -> System.out.println(s));

        Stream.concat(list.stream(),list2.stream()).forEach(s -> System.out.println(s));

        System.out.println("=================");
        //distinct() 去重
        list.stream().distinct().forEach(s -> System.out.println(s));
    }
}

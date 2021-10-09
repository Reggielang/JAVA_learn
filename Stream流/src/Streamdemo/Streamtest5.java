package Streamdemo;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Streamtest5 {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>(List.of("张三丰","张无忌","张翠山","王二虎","张良"));
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张翠山");
        list.add("王二虎");
        list.add("张良");

        //forEach-- 对此流中的每个元素执行操作  在底层会循环获取流中的每一个数据
        list.stream().forEach(s -> System.out.println(s));

        //count()
        long count = list.stream().count();
        System.out.println(count);
    }
}

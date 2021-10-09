package Streamdemo;

import java.awt.image.ImageProducer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/*
收集方法collector

 */
public class Streamtest8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("zhangsan,23");
        list.add("lisi,24");
        list.add("wangwu,25");

        Map<String, Integer> map = list.stream().filter(s -> {
            String[] split = s.split(",");
            int age = Integer.parseInt(split[1]);
            return age >= 24;
            //collect只能获取到流中的数据，不能创建容器，也不能把数据添加到容器中
            //Collectors。toMap 创建一个map集合并将数据添加到集合当中
            //第一个lambda表达式获取Map中的键，第二个是获取Map中的值
        }).collect(Collectors.toMap(
                s -> s.split(",")[0],
                s -> Integer.parseInt(s.split(",")[1])));

        System.out.println(map);


    }
}

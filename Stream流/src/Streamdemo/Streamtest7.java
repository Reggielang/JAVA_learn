package Streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
收集方法collector

 */
public class Streamtest7 {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>(List.of("张三丰","张无忌","张翠山","王二虎","张良"));
        ArrayList<Integer> list = new ArrayList<>();
        //批量添加
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);

        list.stream().filter(num->num%2==0).forEach(num-> System.out.println(num));

        //collect负责收集数据，获取流中剩余数据，不会创建容器，也不负责把数据添加到容器中
        //Collectors.toList() 在底层创建一个List集合，并把所有的数据添加到List集合中
        List<Integer> collect1 = list.stream().filter(num->num%2==0)
                .collect(Collectors.toList());
        System.out.println(collect1);

        //Collectors.toSet() 在底层创建一个Set集合，并把所有的数据添加到Set集合中
        Set<Integer> collect2 = list.stream().filter(num->num%2==0)
                .collect(Collectors.toSet());
        System.out.println(collect2);





    }
}

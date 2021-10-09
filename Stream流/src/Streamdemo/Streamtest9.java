package Streamdemo;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
练习

 */
public class Streamtest9 {
    public static void main(String[] args) {
        ArrayList<String> manlist = new ArrayList<>();
        manlist.add("吴京");
        manlist.add("张国立");
        manlist.add("王宝强");
        manlist.add("周星驰");
        manlist.add("徐峥");
        manlist.add("沈腾");

        ArrayList<String> womanlist = new ArrayList<>();

        womanlist.add("杨紫");
        womanlist.add("关晓彤");
        womanlist.add("赵丽颖");
        womanlist.add("杨幂");
        womanlist.add("张天爱");
        womanlist.add("沈佳宜");


        //男演员名字为三个字的前两个人
        Stream<String> stream1 = manlist.stream().filter(name -> name.length() == 3).limit(2);

        //女演员姓杨，不要第一个
        Stream<String> stream2 = womanlist.stream().filter(name -> name.startsWith("杨")).skip(1);

        Stream.concat(stream1, stream2).forEach(name ->{
            Actor actor = new Actor(name);
            System.out.println(actor);
        } );

    }
}

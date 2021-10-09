package Streamdemo;

import java.util.ArrayList;
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
public class Streamtest {
    public static void main(String[] args) {
        //集合的批量添加 JDK9才有
//        ArrayList<String> list = new ArrayList<>(List.of("张三丰","张无忌","张翠山","王二虎","张良"));
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张翠山");
        list.add("王二虎");
        list.add("张良");
        //遍历list,把张开头的元素添加到list2
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")){
                list2.add(s);
            }
        }
        //遍历list2，把长度为3的元素添加到list3中
        ArrayList<String> list3 = new ArrayList<>();
        for (String s : list2) {
            if (s.length()==3){
                list3.add(s);
            }
        }
        for (String s : list3) {
            System.out.println(s);
        }
        System.out.println("===================");
        //Stream流
        list.stream().filter(s->s.startsWith("张"))
                .filter(s->s.length()==3)
                .forEach(s-> System.out.println(s));


    }
}

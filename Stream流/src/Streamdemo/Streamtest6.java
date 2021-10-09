package Streamdemo;

import java.util.ArrayList;

/*
stream流中无法修改，集合，数组等数据源中的数据！！！
 */
public class Streamtest6 {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>(List.of("张三丰","张无忌","张翠山","王二虎","张良"));
        ArrayList<Integer> list = new ArrayList<>();
        //批量添加
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }

//        list.stream().filter(
//                (Integer i)->{
//                    //是否为偶数
//                    return i%2==0;
//                }
//        )

        list.stream().filter(num->num%2==0).forEach(num-> System.out.println(num));

        System.out.println("===============");

        for (Integer integer : list) {
            System.out.println(integer);
        }

    }
}

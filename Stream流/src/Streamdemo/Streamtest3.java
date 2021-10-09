package Streamdemo;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Streamtest3 {
    public static void main(String[] args) {
        //集合的批量添加
//        ArrayList<String> list = new ArrayList<>(List.of("张三丰","张无忌","张翠山","王二虎","张良"));
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张翠山");
        list.add("王二虎");
        list.add("张良");

        //filter方法获取流中没一个数据，而test方法中的s,依次表示流中的每一个数据，我们只要在test方法中对s进行判断就行了
        //如果为true，数据留下，为false，数据剔除
//        list.stream().filter(
//                new Predicate<String>() {
//                    @Override
//                    public boolean test(String s) {
//                        boolean result = s.startsWith("张");
//                        return result;
//                    }
//                }
//        ).forEach(s -> System.out.println(s));

        //因为predicate类中只有一个抽象方法，可以使用lambda表达式来简化
//        list.stream().filter((String s)->{
//            boolean result = s.startsWith("张");
//            return result;
//        }).forEach(s -> System.out.println(s));

        list.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));
    }
}

package List;

import java.util.ArrayList;
/*
集合和数组： 都是存储数据，但集合是可变的，数组长度不可变

 */

public class demoArraylist {
    public static void main(String[] args) {
        //创建集合容器对象 --<>可以对数据类型进行限制,没加就可以添加任意数据
        ArrayList<String> l  = new ArrayList<>();
        //向容器中添加数据
        l.add("111");
        l.add("222");
        l.add("333");
        //向特定索引添加数据
        l.add(0,"666");

        System.out.println(l);
    }
}

package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*
数组的长度不可变的，集合的长度是可变的
数组可以存储基本数据类型和引用数据类型
集合只能存储引用数据类型，或者基本数据类型的包装类
 */
public class Collectiondemo2 {
    public static void main(String[] args) {

        Collection<String> coll = new ArrayList<>();
//        boolean add(E e) 添加元素
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("cccc");
        System.out.println(coll);

//        boolean  remove(Object o) 从集合中删除指定元素
        boolean result = coll.remove("aaa"); //成功删除返回true，不成功返回false

//        boolean removeIf(Object o) 根据条件进行删除
        //removeIf会遍历集合，得到集合中的每一个元素，s依次表示集合中的每一个元素，就会把每一个元素都到lambda表达式中
        //判断一下，如果返回true就删除，false就保留
        coll.removeIf(
                (String s)->{
                    return s.length() == 3;
                }
        );
        System.out.println(coll);

//          void  Clear() 清空集合
        //删除集合中的所有元素
        coll.clear();
        System.out.println(coll);

//        boolean contains(Object o) 判断集合是否存在指定元素
        boolean result2 = coll.contains("cccc");
        System.out.println(result2);

//        boolean isEmpty() 判断集合是否为空
        boolean result3 = coll.isEmpty();
        System.out.println(result3);

//            int size() 集合的长度，也就是集合中元素的个数
        int size = coll.size();
        System.out.println(size);
    }
}

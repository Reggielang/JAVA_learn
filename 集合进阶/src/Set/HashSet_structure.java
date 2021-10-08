package Set;
/*
HashSet
1.7版本原理解析
底层是哈希表（数组，链表）
1.创建一个默认长度为16的，默认加载因子0.75的数组，数组名table
2.根据元素的哈希值根数组的长度计算出应存入的位置
3.判断当前位置是否为null，如果是null直接存入
4.如果应存入的位置不是null，表示有元素，则调用equals方法比较属性值
5。如果一样，则不存，如果不一样则存入数组，老元素挂在新元素下面

1.8优化
底层是哈希表（数组，链表，红黑树）
当挂在下面的元素太多时，不利于查询，也不利于添加。所以当链表长度大于8，自动转为红黑树。
 */

import java.util.HashSet;

public class HashSet_structure {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();

    }

}

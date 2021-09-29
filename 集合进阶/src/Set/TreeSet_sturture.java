package Set;

import java.util.TreeSet;

/*
二叉查找树
特点；
1.每一个节点最多有两个子节点
2.每一个节点的左子结点，都是小于自己的
3.每个节点的右子节点，都是大于自己的
添加节点规则：小的存右边，大的存左边，一样的不存
 */
public class TreeSet_sturture {
    //存储字符串并遍历
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(4);
        ts.add(3);
        ts.add(2);
        ts.add(1);

        System.out.println(ts);

    }
}

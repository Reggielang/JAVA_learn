package Set;

import java.util.Comparator;
import java.util.TreeSet;

/*
默认使用自然排序，当自然排序不满足需求的时候，就用比较器排序
 */
public class TreeSetdemo4 {
    //存储字符串并遍历
    public static void main(String[] args) {
//        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                int result = o1.length()-o2.length();
//                result = result ==0? o1.compareTo(o2):result;
//                return result;
//            }
//        });
        //lambda表达式
        TreeSet<String> ts = new TreeSet<>(
                (String o1, String o2) -> {
                    int result = o1.length() - o2.length();
                    result = result == 0 ? o1.compareTo(o2) : result;
                    return result;
                }
        );

        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        System.out.println(ts);
    }
}

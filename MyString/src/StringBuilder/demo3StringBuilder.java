package StringBuilder;

public class demo3StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //append方法，添加任意类型的数据
        sb.append(123);
        sb.append("abc");
        sb.append(true);
        System.out.println(sb);

        //链式编程：如果一个方法返回的是对象，对象可以继续向下调用
        sb.append("红色").append("蓝色").append("绿色");
        //反转
        sb.reverse();

        sb.length();

        String s = sb.toString();
        System.out.println(s);
    }
}

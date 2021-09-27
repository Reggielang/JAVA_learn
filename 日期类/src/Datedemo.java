import java.util.Date;
/*


 */
public class Datedemo {
    public static void main(String[] args) {
//        public Date() 创建一个Date的对象，表示默认时间

//        public Date(long date) 创建一个Date的对象，表示指定时间

        //空参构造 -- 表示电脑当前时间
        Date date1 = new Date();
        System.out.println(date1);

        //有参构造 -- 从计算机的原点开始，过了指定毫秒的时间
        Date date2 = new Date(0L);
        System.out.println(date2);
        //因为我们的时间是在东八区，需要+8小时

    }
}

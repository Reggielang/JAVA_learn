import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
1.格式化从date到string-- 把时间按照固定格式进行展示
2.解析从string到date -- 需要对时间进行判断和计算

 */
public class DateTest1 {
    public static void main(String[] args) throws ParseException {
        //开始时间 2020年11月11日 0:0:0
        //结束时间 2020年11月11日 0:10:0

        //小A 2020年11月11日 0:03:47
        //小B 2020年11月11日 0:10:11

        //1.判断两位同学的下单时间是否在范围之内
        //2.把每一个时间换算成毫秒值--才能进行计算和判断

        String start = "2020年11月11日 0:0:0";
        String end = "2020年11月11日 0:10:0";


        String a = "2020年11月11日 0:03:47";
        String b = "2020年11月11日 0:10:11";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        long starttime = sdf.parse(start).getTime();
        long endtime = sdf.parse(end).getTime();

        long a_time = sdf.parse(a).getTime();
        long b_time = sdf.parse(b).getTime();

        if (a_time>=starttime&&a_time<=endtime){
            System.out.println("活动参加成功");
        }else {
            System.out.println("没有参加活动");
        }
        System.out.println("--------------------");
        if (b_time>=starttime&&b_time<=endtime){
            System.out.println("活动参加成功");
        }else {
            System.out.println("没有参加活动");
        }

    }
}

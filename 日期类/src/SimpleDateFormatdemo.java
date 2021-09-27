import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
simpledateformat 可以格式化或解析一个date对象
y M d H m s
yyyy-MM-dd HH:mm:ss
yyyy年MM月dd日 HH:mm:ss
 */
public class SimpleDateFormatdemo {
    public static void main(String[] args) throws ParseException {

        //当前时间的date对象
        Date date = new Date();
        //格式化
        //创建了一个日期格式
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        String result = sdf.format(date);
        System.out.println(result);


        //解析
        String s  = "2021-01-01";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        Date result2 = sdf2.parse(s);
        System.out.println(result2);


    }
}

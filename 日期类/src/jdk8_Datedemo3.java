
import java.time.DayOfWeek;
import java.time.LocalDateTime;

/*
now -- 表示当前时间封装一个localdatetime对象
使用指定的你年月日时间初始化为一个localdatetime对象
 */
public class jdk8_Datedemo3 {
    public static void main(String[] args){
        LocalDateTime time = LocalDateTime.of(2020, 11, 11, 11, 11, 11);
//        public int getYear();
        int year = time.getYear();
        System.out.println(year);

//        public int getMonthValue();
        int month = time.getMonthValue();
        System.out.println(month);

//        public int getDayofMonth();
        int day = time.getDayOfMonth();
        System.out.println(day);

//        public int getDayofYear();
        int dayofyear = time.getDayOfYear();
        System.out.println(dayofyear);

//        public DayOfWeek getDayOfWeek();
        DayOfWeek dayOfWeek = time.getDayOfWeek();
        System.out.println(dayOfWeek);

//        public int getMinute();
        int minute = time.getMinute();
        System.out.println(minute);

//        public int getHour();
        int hour = time.getHour();
        System.out.println(hour);
    }


}

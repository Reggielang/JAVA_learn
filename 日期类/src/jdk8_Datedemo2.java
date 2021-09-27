
import java.time.LocalDateTime;
/*
now -- 表示当前时间封装一个localdatetime对象
使用指定的你年月日时间初始化为一个localdatetime对象
 */
public class jdk8_Datedemo2 {
    public static void main(String[] args){
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime date = LocalDateTime.of(2020, 11, 11, 11, 11, 11);
        System.out.println(date);
    }


}

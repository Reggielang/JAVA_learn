import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class jdk8_Datedemo {
    public static void main(String[] args) throws ParseException {
        String s = "2020年11月11日 00:00:00";
        //jkdmethod();

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime date = LocalDateTime.parse(s, pattern);
        LocalDateTime newdate = date.plusDays(1);
        String result = newdate.format(pattern);
        System.out.println(result);
    }

    private static void jkdmethod() throws ParseException {
        String s = "2020年11月11日 00:00:00";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = sdf.parse(s);
        long time = date.getTime();
        time = time +(1000*60*60*24);

        Date newdate = new Date(time);
        String result = sdf.format(newdate);
        System.out.println(result);
    }


}

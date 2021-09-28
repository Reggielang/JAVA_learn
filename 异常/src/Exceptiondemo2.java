import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Exceptiondemo2 {
    public static void main(String[] args) throws ParseException {
        method1(); //此时调用者没有处理，也会交给JVM虚拟机处理
        method2();

    }

    //告诉调用者，你调用哦，有可能会出现这个异常
    // 如果方法中没有异常，正常运行 如果出现异常，其实也是将这个异常交给调用者处理
    //注意：如果声明的异常，是一个运行时异常，那么可以声明的代码可以省略
    private static void method1() throws NullPointerException{
        int[] arr = null;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    //注意：如果声明的异常，是一个编译异常，那么可以声明的代码则必须写
    private static void method2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.parse("2020-12-11");
    }



}

package thread3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //线程开启之后，需要执行里面的call方法
        MyCallable mc = new MyCallable();
        //可以获取线程执行完毕之后的结果，可以作为参数传给thread对象
        FutureTask<String> ft = new FutureTask<>(mc);
        //创建线程对象
        Thread t1 = new Thread(ft);
        //开启线程
        t1.start();
        //!注意：get方法，一直实在启动线程之后，get获取线程运行之后的结果，如果线程还没有运行结果，那么会一直等待结果
        String s = ft.get();
        System.out.println(s);
    }
}

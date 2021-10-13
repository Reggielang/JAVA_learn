package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Threadpool {
    public static void main(String[] args) throws InterruptedException {
        //1.创建一个默认的线程池对象，池子中默认是空的，默认最多容纳int类型的最大值
        ExecutorService executorService = Executors.newCachedThreadPool();
        //Executors帮助创建线程池对象
        //ExecutorService帮助控制线程池
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行了");
        });

        Thread.sleep(2000);

        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行了");
        });

        //关闭线程池
        executorService.shutdown();
    }
}

package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Threadpool2 {
    public static void main(String[] args) throws InterruptedException {
        //1.不是初始值而是最大值
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //Executors帮助创建线程池对象
        //ExecutorService帮助控制线程池
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行了");
        });

        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行了");
        });



        ThreadPoolExecutor pool= (ThreadPoolExecutor) executorService;
        System.out.println(pool.getPoolSize());

        //关闭线程池
        //executorService.shutdown();
    }
}

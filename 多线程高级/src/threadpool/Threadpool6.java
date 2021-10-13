package threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Threadpool6 {
    public static void main(String[] args) throws InterruptedException {
        //1.核心线程数量
        // 2.最大线程数
        // 3.空闲线程最大存活时间
        // 4、时间单位
        // 5、任务队列
        // 6、创建线程工厂
        // 7、任务的拒绝策略-- 什么时候拒绝任务-- 当提交的任务>池子中的最大线程数量+队列容量
        // 如何拒绝
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                1,
                2,
                2,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardOldestPolicy());
        for (int i = 0; i < 10; i++) {
            int y = i;
            pool.submit(()->{
                System.out.println(Thread.currentThread().getName()+"---"+y);
            });
        }
        pool.shutdown();
    }
}

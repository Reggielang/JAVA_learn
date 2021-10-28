package TCPdemo7;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

//使用多线程可以让服务器同时处理多个客户端，但是非常浪费资源。可以使用线程池进行进一步的优化
public class Serverdemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10001);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,//核心线程数量
                10,//线程池的总数量
                60,//临时线程空闲时间
                TimeUnit.SECONDS,//临时线程空闲时间的单位
                new ArrayBlockingQueue<>(5),//阻塞队列
                Executors.defaultThreadFactory(),//创建线程的方式
                new ThreadPoolExecutor.AbortPolicy()//任务拒绝策略
        );

        while (true) {
            Socket accept = ss.accept();
            Threadsocket ts = new Threadsocket(accept);
            //new Thread(ts).start();
            pool.submit(ts);
        }
        //ss.close();
    }
}

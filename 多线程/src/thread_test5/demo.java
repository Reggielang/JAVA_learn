package thread_test5;

import java.util.concurrent.ArrayBlockingQueue;

public class demo {
    public static void main(String[] args) throws InterruptedException {
        //阻塞队列的基本用法 --参数为容量
        //创建阻塞队列的对象
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(1);

        //存储元素
        arrayBlockingQueue.put("汉堡包");

        //取元素
        System.out.println(arrayBlockingQueue.take());
        System.out.println(arrayBlockingQueue.take());
    }
}

package thread_test6;

import java.util.concurrent.ArrayBlockingQueue;

public class demo {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> list = new ArrayBlockingQueue<>(1);
        //创建线程并开启
        Cooker c = new Cooker(list);
        Foodie f = new Foodie(list);
        c.start();
        f.start();
    }
}

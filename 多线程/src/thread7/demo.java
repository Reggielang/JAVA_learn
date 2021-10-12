package thread7;

import thread7.MyCallable;

import java.util.concurrent.FutureTask;

public class demo {
    public static void main(String[] args) {
        //优先级：1-10 默认值：5
        MyCallable mc = new MyCallable();
        FutureTask<String> ft = new FutureTask<>(mc);
        Thread t1 = new Thread(ft);
        t1.setName("飞机");
        //System.out.println(t1.getPriority()); //线程的优先级
        t1.setPriority(10);
        t1.start();

        MyCallable mc2 = new MyCallable();
        FutureTask<String> ft2 = new FutureTask<>(mc);
        Thread t2 = new Thread(ft2);
        t2.setName("坦克");
        //System.out.println(t2.getPriority());
        t1.setPriority(1);
        t2.start();


    }
}

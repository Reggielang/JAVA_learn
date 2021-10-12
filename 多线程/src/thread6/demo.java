package thread6;

import thread6.MyRunnable;

public class demo {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println("睡觉前");
//        Thread.sleep(1000); //毫秒
//        System.out.println("睡醒了");

        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.start();
        t2.start();

    }
}

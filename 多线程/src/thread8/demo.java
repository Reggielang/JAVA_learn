package thread8;

import thread8.MyThread1;
import thread8.MyThread2;
public class demo {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.setName("女神");
        t2.setName("备胎");

        //把第二个线程设置为守护线程
        //当普通线程，执行完毕之后，那么守护线程就没有运行的必要了
        t2.setDaemon(true);

        t1.start();
        t2.start();
    }
}

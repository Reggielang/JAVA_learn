package thread_test;

import thread4.MyThread;
/*
多线程共享数据的问题
同步代码块：锁多条语句操作共享数据，可以使用同步代码块实现
好处：解决了多线程的数据安全问题
弊端：当线程很多时，每个线程都会去判断同步上的锁，很耗费资源，无形种降低了程序的运行效率
注意；多个线程必须使用同一个锁！
 */
public class demo {
    public static void main(String[] args) {

        Ticket ticket = new Ticket();
        Thread t1 = new Thread(ticket);
        Thread t2 = new Thread(ticket);
        Thread t3 = new Thread(ticket);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

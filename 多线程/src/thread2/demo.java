package thread2;


public class demo {
    public static void main(String[] args) {
        //创建了一个参数的对象
        MyRunnable mr = new MyRunnable();
        //创建了一个线程对象，并把参数传给了个个线程
        //在线程启动后，执行的就是参数里的run方法
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        //开启线程
        t1.start();
        t2.start();
    }
}

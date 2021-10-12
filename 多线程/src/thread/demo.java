package thread;

public class demo {
    public static void main(String[] args) {
        //创建一个线程对象
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        //        t1.run()//表示的仅仅是创建对象，用对象去调用方法，并没有开启线程
        //开启一条线程
        t1.start();//启动线程，然后由JVM调用此线程的run()方法
        //开启第二条线程
        t2.start();
    }

}

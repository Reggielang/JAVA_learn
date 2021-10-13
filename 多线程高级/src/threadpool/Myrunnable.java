package threadpool;

public class Myrunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"在执行了");
    }
}

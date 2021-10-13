package Lock;

import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable{
    //票的数量
    private int ticket = 100;
    private Object ob = new Object();
    private ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            //synchronized (ob){ //多个线程必须使用同一个锁
            try {
                lock.lock();
                if (ticket<=0){
                    //票卖完了
                    break;
                }else{
                        Thread.sleep(100);
                    ticket--;
                    System.out.println(Thread.currentThread().getName()+"在卖票，还剩余"+ticket);
                }
            } catch (InterruptedException e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }

            //}
        }
    }
}

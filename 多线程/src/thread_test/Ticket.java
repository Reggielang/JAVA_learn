package thread_test;

public class Ticket implements Runnable{
    //票的数量
    private int ticket = 100;
    private Object ob = new Object();
    @Override
    public void run() {
        while (true){
            synchronized (ob){ //多个线程必须使用同一个锁
                if (ticket<=0){
                    //票卖完了
                    break;
                }else{
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket--;
                    System.out.println(Thread.currentThread().getName()+"在卖票，还剩余"+ticket);
                }
            }
        }
    }
}

package thread_test2;

public class MyThread extends Thread{
    private static int ticketcount=100;
    private static Object obj = new Object();
    @Override
    public void run() {
        while (true){
        synchronized (obj){
            if (ticketcount<=0){
                //票卖完了
                break;
            }else{
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ticketcount--;
                System.out.println(Thread.currentThread().getName()+"在卖票，还剩余"+ticketcount);
                }
            }
        }
    }
}

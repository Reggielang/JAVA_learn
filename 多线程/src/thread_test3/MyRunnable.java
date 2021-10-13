package thread_test3;
/*
同步方法：同步方法是锁住方法中的所有代码
同步方法：不能指定锁对象 同步方法的锁对象是this

 */
public class MyRunnable implements Runnable{
    private static int ticketcount =100;
    @Override
    public void run() {
        while (true){
            if ("窗口1".equals(Thread.currentThread().getName())){
                //同步方法
                boolean result = synchronizedMethod();
                if (result){
                    break;
                }
            }
            if ("窗口2".equals(Thread.currentThread().getName())){
                //同步方法块
                synchronized (MyRunnable.class){
                    if (ticketcount ==0){
                        break;
                    }else {
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        ticketcount--;
                        System.out.println(Thread.currentThread().getName()+"在买票，还剩下"+ticketcount);
                    }
                }
            }
        }
    }

    private static synchronized boolean synchronizedMethod() {
        if (ticketcount == 0){
            return true;
        }else {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticketcount--;
            System.out.println(Thread.currentThread().getName()+"在买票，还剩下"+ticketcount);
            return false;
        }
    }
}

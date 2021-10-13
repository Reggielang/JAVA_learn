package deadLock;
/*
死锁：
 */
public class DEMO {
    public static void main(String[] args) {
        Object objA = new Object();
        Object objB = new Object();

        new Thread(()->{
            while (true){
                synchronized (objA){
                    //线程1
                    synchronized (objB){
                        System.out.println("小康同学在走路");
                    }
                }
            }
        }).start();

        new Thread(()->{
            while (true){
                synchronized (objB){
                    //线程2
                    synchronized (objA){
                        System.out.println("小微同学在走路");
                    }
                }
            }
        }).start();
    }
}

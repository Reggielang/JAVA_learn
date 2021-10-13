package thread_test3;

public class demo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.setName("窗口1");
        t2.setName("窗口2");

        t1.start();
        t2.start();

    }
}

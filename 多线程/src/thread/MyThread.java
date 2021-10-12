package thread;

public class MyThread extends Thread{
    //run是用来封装被线程执行的代码
    @Override
    public void run() {
        //线程在开始之后执行的代码
        for (int i = 0; i < 100; i++) {
            System.out.println("线程开启了"+i);
        }
    }
}

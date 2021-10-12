package thread4;

import thread6.MyRunnable;

import java.util.concurrent.FutureTask;

public class MyThread extends Thread{
    public MyThread(FutureTask<String> mr) {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"@@@"+i);
        }
    }
}

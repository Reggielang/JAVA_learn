package threadatom3;

import java.util.concurrent.atomic.AtomicInteger;

public class atomthread implements Runnable{
    AtomicInteger ac = new AtomicInteger(0);
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            int count = ac.incrementAndGet();
            System.out.println(count+"个冰淇凌");
        }
    }
}

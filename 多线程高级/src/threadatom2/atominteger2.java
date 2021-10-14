package threadatom2;

import java.util.concurrent.atomic.AtomicInteger;

public class atominteger2 {
    public static void main(String[] args) {
        AtomicInteger ac = new AtomicInteger(10);
        System.out.println(ac);
        //get
        System.out.println(ac.get());

        //返回的自增前的值
        int andIncrement = ac.getAndIncrement();
        System.out.println(andIncrement);

        //返回自增后的值
        int andIncrement1 = ac.incrementAndGet();
        System.out.println(andIncrement1);


        //返回和参数相加的值
        int addAndGet = ac.addAndGet(10);
        System.out.println(addAndGet);

        //设置一个新值，但返回旧的值
        int andSet = ac.getAndSet(1);
        System.out.println(andSet);

        System.out.println(ac.get());
    }
}

package threadatom2;

import java.util.concurrent.atomic.AtomicInteger;

public class atominteger {
    public static void main(String[] args) {
        AtomicInteger ac = new AtomicInteger();
        System.out.println(ac);

        AtomicInteger ac2 = new AtomicInteger(10);
        System.out.println(ac2);
    }
}

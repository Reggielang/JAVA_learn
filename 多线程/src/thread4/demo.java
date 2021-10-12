package thread4;

import thread4.MyThread;

public class demo {
    public static void main(String[] args) {
        //线程是有默认名字的，格式thread-编号
        MyThread t1 = new MyThread("小菜");
        MyThread t2 = new MyThread("小强");

//        t1.setName("小菜");
//        t2.setName("小强");

        t1.start();
        t2.start();
    }
}

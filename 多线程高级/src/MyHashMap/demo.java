package MyHashMap;

import java.util.HashMap;
import java.util.Hashtable;

/*
HashMap 是线程不安全的，多线程环境下会有数据安全问题
Hashtable Hashtable是线程不安全的（多线程环境下可能会存在问题）
为了保证数据的安全性我们可以使用Hashtable, 但是Hashtable的效率低下

Hashtable 采用悲观锁synchronized ()的形式保证数据安全，只要有线程访问，会将整张表锁起来，所以Hashtable的效率低下。
 */

public class demo {
    public static void main(String[] args) throws InterruptedException {
        Hashtable<String,String> hm = new Hashtable<>();

        Thread t1 = new Thread(()->{
            for (int i = 0; i < 25; i++) {
                hm.put(i+"",i+"");
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 25; i < 51; i++) {
                hm.put(i+"",i+"");
            }
        });

        t1.start();
        t2.start();

        System.out.println("--------------");
        //为了t1,和t2能把数据添加完
        Thread.sleep(1000);


        for (int i = 0; i < 51; i++) {
            System.out.println(hm.get(i+""));
        }

    }
}

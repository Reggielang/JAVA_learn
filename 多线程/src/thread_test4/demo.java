package thread_test4;

public class demo {
    public static void main(String[] args) {
        /*
        1.判断桌子上是否有汉堡包
        2.如果没有就等待
        3.如果有就开吃
        4.吃完之后，桌子上的汉堡包就没有了，叫醒等待的生产者继续生产。
        汉堡包的总数量减1
         */

        /*
        1.判断卓子上是否有汉堡包
        如果有就等待，如果没有才生产
        2.把汉堡包放在桌子上
        3.叫醒等待的消费者开吃
         */

        Desk desk = new Desk(false,10);

        Foodie f = new Foodie(desk);
        Cooker c = new Cooker(desk);

        f.start();
        c.start();
    }
}

package thread_test4;

public class Foodie extends Thread{
    private Desk desk;
    public Foodie(Desk desk) {
        this.desk = desk;
    }

    @Override
    public void run() {
//        1.判断桌子上是否有汉堡包
//        2.如果没有就等待
//        3.如果有就开吃
//        4.吃完之后，桌子上的汉堡包就没有了，叫醒等待的生产者继续生产。
//        汉堡包的总数量减1
        //套路：1.while(true)死循环 2.synchronized锁，锁对象要唯一
        //3.判断，共享数据是否结束，结束 4.判断共享数据是否结束，没有结束
        while (true){
            synchronized (desk.getLock()){
                if (desk.getCount() ==0){
                    break;
                }else {
                    if (desk.isFlag()){
                        //有
                        System.out.println("吃货开吃汉堡包");
                        desk.setFlag(false);
                        desk.getLock().notifyAll();
                        desk.setCount(desk.getCount()-1);
                    }else {
                        //没有就等待
                        //使用什么对象当作锁，就必须用这个对象就调用等待和唤醒方法
                        try {
                            desk.getLock().wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        }

    }
}

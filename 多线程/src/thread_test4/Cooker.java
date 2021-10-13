package thread_test4;

public class Cooker extends Thread{
//        1.判断卓子上是否有汉堡包
//        如果有就等待，如果没有才生产
//        2.把汉堡包放在桌子上
//        3.叫醒等待的消费者开吃

    private Desk desk;
    public Cooker(Desk desk) {
        this.desk = desk;
    }
    @Override
    public void run() {
        while (true){
            synchronized (desk.getLock()){
                if (desk.getCount()==0){
                    break;
                }else {
                    if (!desk.isFlag()){
                        //生产
                        System.out.println("厨师正在生产汉堡包");
                        desk.setFlag(true);
                        desk.getLock().notifyAll();
                    }else {
                        //等待
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

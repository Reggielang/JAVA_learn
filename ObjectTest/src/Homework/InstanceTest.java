package Homework;

public class InstanceTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p);
        p.sentEmail();
        p.playGame();

        //匿名对象 -- 只能调用一次， 没有显式的赋给一个变量名
        new Phone().sentEmail();
        new Phone().playGame();

        new Phone().price =1999;
        new Phone().showprice();
    }



}


class Phone{
    double price;

    public void sentEmail(){
        System.out.println("发送邮件");
    }
    public void playGame(){
        System.out.println("玩游戏");
    }

    public void showprice(){
        System.out.println("手机价格为"+price);
    }
}
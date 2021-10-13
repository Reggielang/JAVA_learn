package myvolatile2;

public class Gril extends Thread{
    @Override
    public void run() {
        while (true){
            synchronized (Money.lock){
                if (Money.money!=100000){
                    System.out.println("结婚基金不是十万");
                    break;
            }
        }

    }
}
}

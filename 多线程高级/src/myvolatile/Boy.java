package myvolatile;

public class Boy extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(10);

            Money.money=90000;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

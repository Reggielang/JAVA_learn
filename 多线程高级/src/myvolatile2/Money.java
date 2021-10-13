package myvolatile2;

public class Money {
    public static Object lock = new Object();
    public volatile static int money = 100000;
}

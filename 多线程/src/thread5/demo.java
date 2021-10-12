package thread5;

public class demo {
    public static void main(String[] args) {
        //Thread.currentThread() 获得当前线程的对象
        String name = Thread.currentThread().getName();
        System.out.println(name);
    }
}

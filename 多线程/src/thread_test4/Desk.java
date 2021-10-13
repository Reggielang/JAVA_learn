package thread_test4;

public class Desk {
    //定义一个标记
    //true 就表示桌子上有汉堡包的，此时允许吃货执行
    //false 表示桌子上没有汉堡包，此时允许厨师执行
//    public static boolean flag = false;
    private boolean flag;

    //汉堡包的总数量
//    public static int count =10;
    //以后在使用这种必须有默认初始化值的变量
//    private int count =10;
    private int count;

    //锁对象
//    public static  final Object lock = new Object();
    private final Object lock = new Object();

    public Desk() {
        //默认初始化值
//        this(false,10);
    }

    public Desk(boolean flag, int count) {
        this.flag = flag;
        this.count = count;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getLock() {
        return lock;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "flag=" + flag +
                ", count=" + count +
                ", lock=" + lock +
                '}';
    }
}

package myvolatile2;

/*
Volatile关键字，强制线程在每次使用时，都会看一下共享区域最新的值
 */
public class demo {
    public static void main(String[] args) {
        Gril gril = new Gril();
        gril.setName("小路同学");
        gril.start();
        Boy boy = new Boy();
        boy.setName("小皮同学");
        boy.start();
    }
}

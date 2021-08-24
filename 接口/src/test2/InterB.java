package test2;

public interface InterB {
    public default void show(){
        System.out.println("我是B接口的show方法");
    }

    public static void print(){
        System.out.println("我是B接口的print方法");
    }
}

package test2;

public interface InterA {
    public default void show(){
        System.out.println("我是A接口的show方法");
    }

    public static void print(){
        System.out.println("我是A接口的print方法");
    }

}

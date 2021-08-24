package Test;
//抽象类 -- 如果类中存在抽象方法，该类必须声明为抽象类
public abstract class Animal {
    public void drink(){
        System.out.println("喝水");
    }
    //抽象方法
    public abstract void eat();

}

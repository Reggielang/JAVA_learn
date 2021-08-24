package test;


/*
接口中的成员变量 默认是常量
构造方法：没有
成员方法：只能是抽象方法，系统默认添加关键字，public abstract
 */
public class testInterface {
    public static void main(String[] args) {
        System.out.println(Inter.NUM);
    }
}

class Interimpl implements Inter{

    public Interimpl(){
        super();
    }
    public void method(){
        System.out.println(NUM);
    }

    @Override
    public void show() {

    }
}
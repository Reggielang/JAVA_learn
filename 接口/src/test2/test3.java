package test2;
/*
默认方法不是抽象方法，存在方法体，可以重写。
如果实现了多个接口，多个接口存在相同的方法声明，子类就必须对该方法进行重写

静态方法，只能通过接口直接调用！
 */
public class test3 {
    public static void main(String[] args) {
        InterAimpl a = new InterAimpl();
        a.show();
//        a.print();
        //静态方法，只能通过接口直接调用！
        InterA.print();
        InterB.print();
    }
}

class InterAimpl implements InterA,InterB{
    @Override
    public void show() {
        System.out.println("我是重写后的show方法");
    }
}
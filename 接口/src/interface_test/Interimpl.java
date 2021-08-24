package interface_test;
//可以进行多实现
public class Interimpl implements inter,InterA{
    @Override
    public void study() {
        System.out.println("我是实现类中的方法");
    }

    @Override
    public void print1() {

    }

    @Override
    public void print2() {

    }
}

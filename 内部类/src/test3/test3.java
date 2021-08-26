package test3;
/*
1.创建实现类，通过implements关键字去实现接口
2.重写方法
3.创建实现类对象
4.调用重写后的方法

匿名内部类：前提--需要存在类、接口
将继承、实现，方法重写，创建对象，放在了一起进行
new inter(){
重写方法}

 */
public class test3 {
    public static void main(String[] args) {
        interimpl i = new interimpl();
        i.show();
        new inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类的show");
            }
        }.show();

        //接口中存在多个方法
        inter2 a  = new inter2(){
            @Override
            public void show1() {
                System.out.println("show1");
            }

            @Override
            public void show2() {
                System.out.println("show2");
            }
        };
        a.show1();
        a.show2();
    }
}

interface inter{
    void show();
}

class interimpl implements inter{
    @Override
    public void show() {
        System.out.println("重写的show");
    }
}
interface inter2{
    void show1();
    void show2();
}
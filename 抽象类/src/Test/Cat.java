package Test;

public class Cat extends Animal{
    //继承了抽象类，需要重写方法
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

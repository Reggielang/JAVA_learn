package test;
/*
要有继承、实现关系
要有方法重写
要有父类引用，指向子类对象
 */
public class test1Polymorphic {
    public static void main(String[] args) {
        //当前事物，是一只猫
        Cat c = new Cat();

        //当前事物，是一只动物
        Animal a = new Cat();
    }
}

class Animal{
    public void eat(){
        System.out.println("动物吃饭");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}



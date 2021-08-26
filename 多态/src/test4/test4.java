package test4;
/*
1.将一个方法的形式参数指定为父类的方法，可以接收这个父类的所有的子类对象
2.不能调用子类的特有方法

 */
public class test4 {
    public static void main(String[] args) {
        Dog d = new Dog();
        useAnimal(d);

        Cat c = new Cat();
        useAnimal(c);

    }

    public static void useAnimal(Animal a){//Animal a = new Dog();
        a.eat();
//        a.watch();
    }


}

//父类
abstract class Animal{
    public abstract void eat();
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
    public void watch(){
        System.out.println("狗看家");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
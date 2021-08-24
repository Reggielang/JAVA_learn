package Test;
/*
1.抽象类不能创建对象
2。抽象类中有构造方法
3.抽象类的子类； 必须重写父类中的所有抽象方法，或者自己也变成一个抽象类
4.抽象类的方法：可以存在普通的方法和抽象方法，也可以没有抽象方法。但有抽象方法，就必须是抽象类
 */
public class testAnimal {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();
        d.drink();

        c.eat();
        c.drink();
    }
}

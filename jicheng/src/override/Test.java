package override;
/*
当子类需要父类的功能，而功能主体子类有独特的内容
可以重写父类中的方法

方法重写-- 在继承体系中，子类出现了父类一模一样的方法声明。
方法重载-- 在同一个类中，方法名相同，参属列表不同，与返回值无关。
 */
public class Test {
    public static void main(String[] args) {
        Iphone2 i = new Iphone2();
        i.smallBlack();
    }
}

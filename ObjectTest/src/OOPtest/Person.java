package OOPtest;

public class Person {
    //属性：成员变量
    public String name;
    public int age = 2;
    public boolean isMale;

    //行为：成员方法
    public void eat() {
        System.out.println("人可以吃饭");
    }

    public void sleep() {
        System.out.println("人可以睡觉");
    }

    public void talk(String language) {
        System.out.println("人可以说话，使用的是" + language);
    }
}

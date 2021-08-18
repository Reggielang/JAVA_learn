package OOPtest;

public class User {
    //属性
    public String name;
    public int age;
    public boolean isMale;


    public void talk(String language) {//形参也是局部变量
        System.out.println("我们用" + language + "进行交流");

    }

    public void eat() {
        String food = "饼子"; //局部变量
        System.out.println("北方人喜欢" + food);
    }
}

package constructor;

public class Student extends Person{
    //子类特有属性
    private int score;

    public Student(){
        super();

    }
    public Student(String name, int age, int score){
        super(name,age);
        this.score = score;
    }
//    public Student(){
//        //子类中所有的构造方法默认都会访问父类的无参构造方法
//        //子类在初始化之前，一定要先访问父类的构造方法，完成父类数据的初始化
//        //系统在每一个构造方法中，默认隐藏的代码super();
//        //super();
//        System.out.println("我是子类的空参构造方法。。。。。。。。。。。");
//    }
//
//    public Student(int score){
//        //super();
//        System.out.println("我是子类的有参构造方法！！！！！！！！");
//    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

package lambda;

public class test {
    public static void main(String[] args) {


        goSwimming(new Swinming() {
            @Override
            public void swim() {
                System.out.println("去游泳了");
            }
        });
        //理解；对于lambda表达式，可以理解为是对匿名内部类进行了优化
        goSwimming(()->{System.out.println("去游泳了");});
    }


    public static void goSwimming(Swinming swinming){
        swinming.swim();
    }
}

//接口
interface Swinming{
    void swim();
}

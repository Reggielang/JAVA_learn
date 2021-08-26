package test4;

public class test4 {
    public static void main(String[] args) {

        goSwimming(new Swinming() {
            @Override
            public void swim() {
                System.out.println("去游泳了");
            }
        });



    }

    public static void goSwimming(Swinming swinming){
        swinming.swim();
    }
}

//接口
interface Swinming{
    void swim();
}



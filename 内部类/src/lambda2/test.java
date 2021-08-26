package lambda2;
/*
lambda表达式的前提
有一个接口，接口中有且仅有一个抽象方法！
 */
public class test {
    public static void main(String[] args) {
        useShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("我是匿名内部类中的show方法");
            }
        });
        //lambda实现
        useShowHandler(()->{ System.out.println("我是lambda中的show方法");});
    }




    public static void useShowHandler(ShowHandler showHandler){
        showHandler.show();
    }
}

interface ShowHandler{
    void show();
}
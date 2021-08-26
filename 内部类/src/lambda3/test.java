package lambda3;

public class test {
    public static void main(String[] args) {
        useStringHandler(new StringHandler() {
            @Override
            public void printMessage(String msg) {
                System.out.println("我是匿名内部类"+msg);
            }
        });

        //lambda实现
        useStringHandler((String msg)->{ System.out.println("我是lambda表达式"+msg);});
    }
    public static void useStringHandler(StringHandler stringHandler){
        stringHandler.printMessage("你在干什么");
    }
}


interface StringHandler{
    void printMessage(String msg);
}
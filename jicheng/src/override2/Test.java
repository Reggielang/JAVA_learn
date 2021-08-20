package override2;
//静态方法不能被重写，注意如果同时为静态方法，子类会将父类的方法隐藏，并不是重写
public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}

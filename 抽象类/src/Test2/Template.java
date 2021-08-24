package Test2;
//模板类
/*
final
 */
public abstract class Template {
    public final void write(){
        System.out.println("《我的爸爸》");
        body();

        System.out.println("这就是我的爸爸。。。。");
    }
    public abstract void body();
}

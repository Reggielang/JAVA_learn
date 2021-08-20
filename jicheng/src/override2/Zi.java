package override2;

public class Zi extends Fu{
    @Override //注解-- 检查当前的方法是否是一个正确的重写方法
    public  void show() {
        System.out.println("Zi...");
    }

    @Override
    //重写方法的权限，子类必须要大于等于父类的权限
    public void method() {

    }
}

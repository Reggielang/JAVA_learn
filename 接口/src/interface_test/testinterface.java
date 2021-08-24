package interface_test;

/*
如果一个类中的所有方法都是抽象方法，可以把类改进为一个接口
如果有大面积的更新方法，而不想去修改每个实现类，可以将新的方法写为带有方法体的默认方法，加入接口中。
如果默认方法调用更简洁，可以把默认方法加static变为静态方法（去掉default）
接口的定义：
public interface 接口名{}

实现接口的格式：
public class 类名 implements 接口名{}

接口不能被实例化
接口和类之间是实现关系，通过implements关键字表示

接口的实现类
1.重写 接口中的所有抽象方法

 */
public class testinterface {
    public static void main(String[] args) {
        inter l = new Interimpl();
        l.study();
    }
}

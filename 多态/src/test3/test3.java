package test3;

public class test3 {
    public static void main(String[] args) {
        //1.向上转型, 父类引用指向子类对象
        fu f = new zi();
        f.show();
        //多态的弊端： 不能调用子类特有成员
//        f.method();

        //A--直接创建子类对象
        //向下转型从父类类型转换为子类类型
        zi z = (zi)f;
        z.method();
    }
}


class fu{
    public void show(){
        System.out.println("fu...show...");
    }
}

class zi extends fu{
    @Override
    public void show() {
        System.out.println("zi..show...");
    }

    public void method(){
        System.out.println("我是子类的特有方法");
    }
}
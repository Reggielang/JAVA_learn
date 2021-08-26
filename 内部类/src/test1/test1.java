package test1;
/*
内部类对象的格式：
外部类名.内部类名 对象名= new 外部类名().new 内部类名();
内部类可以直接访问外部类成员，包括私有
成员内部类
private--私有成员内部类访问；在自己所在的外部类中创建对象访问

static --静态成员内部类访问：外部类名.内部类名 对象名= new 外部类名().new 内部类名();
 */
public class test1 {
    public static void main(String[] args) {
            outer.inner i = new outer().new inner();
        System.out.println(i.num);
        i.show();
    }
}

class outer{
    private int a = 10;
    class inner{
        int num =10;
        public void show(){
            System.out.println("inner ...show");
            System.out.println(a);
        }
    }
}
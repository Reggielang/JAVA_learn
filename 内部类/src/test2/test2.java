package test2;

public class test2 {
    public static void main(String[] args) {
        outer o = new outer();
        o.method();
    }
}

//局部内部类-- 访问方式；只能在方法中，创建对象并访问
class outer{
    int a = 10;
    public void method(){
        int b = 20;
        class inner{
            public void show(){
                System.out.println("show...");
                System.out.println(a);
                System.out.println(b);
            }
        }

        inner i = new inner();
        i.show();
    }
}
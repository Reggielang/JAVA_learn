package OOPtest;

// 返回值类型
//有返回值 如果方法有返回值，必须在声明方法时，指定返回值类型，同时在方法中要使用return关键字来返回指定类型的返回值。
//
// 没有返回值  没有返回值的方法使用void来声明，并且没有返回值。
//
//return  使用在方法体中 作用：结束方法  针对于有返回值类型的方法
// 方法的使用中，可以调用当前类的属性和方法. 特殊：方法A中又调用了A方法，这种叫递归方法
public class Customer {
    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat() {
        System.out.println("客户吃饭");
    }


    public void sleep(int hour) {
        System.out.println("休息了" + hour + "个小时了");
    }

    public String getName() {
        if (age > 18) {
            return name;
        } else {
            return "Tom";
        }

    }

    public String getNation(String nation) {
        String info = "我的国籍是" + nation;
        return info;
    }

    public void sort(int[] arr) {

    }
}

package OOPtest;

public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.eat();

        c1.sleep(8);

        int[] arr = new int[]{3,4,5,6,87,65};
        c1.sort(arr);
    }
}

//public void eat(){}
//public void sleep(int hour){}
//public  String getName(){}
//public String getNation(String nation){}

//方法的声明  static final abstract 来修饰的方法

//关于权限修饰符 private public 缺省 protected


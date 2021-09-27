package MyInteger;

/*
Integer包装了一个基本数据int类型
构造方法过时了，已经被静态方法替代了
 */
public class MyIntger3 {
    public static void main(String[] args) {
        //根据int和String值创建对象 （过时了）
        Integer i1 = 100;
        //     对象    =  默认是一个基本数据类型
        //特性：自动装箱 -- 装箱 把一个基本数据类型 变量对应的包装类 java底层会自动调用valueof方法

        System.out.println(i1);

        //自动拆箱： -- 把一个包装类型，变为相应的基本数据类型
        int i2 = i1;
        System.out.println(i2);

        Integer i3 = 100; //自动装箱
        i3+=200; // i3 = i3+200; 会把i3变为基本数据类型，结果的300自动装箱为integer对象
        System.out.println(i3);

        //细节  -- null 不可转换为基本数据类型 
        Integer i4 = null;
        i4+=200;
        System.out.println(i4);
    }
}

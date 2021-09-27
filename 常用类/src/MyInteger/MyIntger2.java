package MyInteger;

/*
Integer包装了一个基本数据int类型
构造方法过时了，已经被静态方法替代了
 */
public class MyIntger2 {
    public static void main(String[] args) {
        //根据int和String值创建对象 （过时了）
        Integer i1 = new Integer(100);
        Integer i2= new Integer("100");

        int i3 = Integer.valueOf(200);
        int i4 = Integer.valueOf("200");
        System.out.println(i3);
        System.out.println(i4);
    }
}

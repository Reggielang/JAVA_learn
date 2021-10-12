package otherIO;

import java.io.*;

/*
对象操作流，可以把对象以字节的形式写到本地文件，直接打开文件是看不懂的，需要读取到内存中
如果要想这个对象能被序列化，那么这个类必须要实现一个接口，Serializable
Serializable--标记性接口，没有任何方法，只要一个类实现了这个接口，就表示这个类可以被序列化
serialVersionUID 序列号 --如果没有定义，会自动定义一个序列号
如果我们修改了类中的信息，那么虚拟机会再次计算出一个序列号

出现问题
第一步：把User对象序列化到本地 -- -2137747110037775194
第二步：修改了Javaben类 导致-- -7731566209145919541
第三步：本文件读取到内存--本地序列号和类中的序列号不一致

解决方法：自定义一个序列号而且这个值不变
 */
public class Converteddemo4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s1 = new Student("小明",16);
        Student s2 = new Student("张三",17);
        Student s3 = new Student("李四",18);

        //写对象
        ObjectOutputStream oos  = new ObjectOutputStream(new FileOutputStream("student.txt"));
        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.writeObject(s3);

        oos.close();

        //读对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"));
        Object obj;
//        while ((obj = ois.readObject())!=null){
//            System.out.println(obj);
//        }
        while (true){
            try {
                Object o = ois.readObject();
            } catch (EOFException e) {
                break;
            }
        }
        ois.close();
    }
}

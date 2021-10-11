package FileClass;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        menthod1();

        method2();

        method3();


    }

    private static void method3() {
        //File(file parent, String child)从父抽象路径名和子路径名字符串创建新的file实例
        File file1 = new File("D:\\大数据相关学习\\JAVA");
        String path = "a.txt";
        File file = new File(file1,path);
        System.out.println(file);
    }

    private static void method2() {
        //File(String parent, String child)从父路径名字符串和子路径名字符串创建新的file实例
        String path1 = "D:\\大数据相关学习\\JAVA";
        String path2 = "a.txt";
        File file = new File(path1,path2);
        System.out.println(file);
    }

    private static void menthod1() {
        //File(String pathname) -通过将给定的路径名字符串转换为抽象路径名来创建新的File实例
        String path ="D:\\大数据相关学习\\JAVA\\a.txt";
        File file = new File(path);
        //问题：为什么要把字符串表示形式的路径变成file对象？
        //为了使用File类里面的方法
    }
}

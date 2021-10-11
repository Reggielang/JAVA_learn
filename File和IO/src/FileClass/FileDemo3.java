package FileClass;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        method1();

        method2();

        //mkdirs 注意；1.可以创建单级文件夹，也可以创建多级文件夹 2.2.不管调用者有没有后缀名，只能创建文件夹
        File file = new File("D:\\大数据相关学习\\JAVA\\aaa\\a.txt");
        boolean mkdirs = file.mkdirs();
        System.out.println(mkdirs);

    }

    private static void method2() {
        //mkdir 创建单级文件夹 注意点：1.只能创建单级文件夹。2.不管调用者有没有后缀名，只能创建单级文件夹
        File file = new File("D:\\大数据相关学习\\JAVA\\aaa");
        boolean mkdir = file.mkdir();
        System.out.println(mkdir);
    }

    private static void method1() throws IOException {
        File file = new File("D:\\大数据相关学习\\JAVA\\a.txt");
        boolean result1 = file.createNewFile();
        System.out.println(result1);
        //createNewFile 注意点：1.如果文件已经存在，创建失败，返回false，2.如果文件不存在，创建成功，返回true
        //3.不管调用者有没有添加后缀名，只能创建文件
    }
}

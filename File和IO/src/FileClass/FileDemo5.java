package FileClass;

import java.io.File;

public class FileDemo5 {
    public static void main(String[] args) {
        File file = new File("D:\\大数据相关学习\\JAVA\\test\\a.txt");
        boolean result1 = file.isFile(); // 测试此路径名表示的file是否是文件
        boolean result2 = file.isDirectory();// 测试此路径名表示的file是否是文件夹
        System.out.println(result1);
        System.out.println(result2);

        File file1 = new File("D:\\大数据相关学习\\JAVA\\test");
        //测试此抽象路径名表示的file是否存在
        boolean exists = file1.exists();
        System.out.println(exists);

        //返回由此抽象路径名表示的文件或目录的名称
        //注意1： 如果调用者是文件，那么获得的是文件名和后缀名 2.如果调用者是文件夹，获得文件夹名
        String name = file1.getName();
        System.out.println(name);

        String name1 = file.getName();
        System.out.println(name1);

    }
}

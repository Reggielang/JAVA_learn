package FileClass;

import java.io.File;

public class FileDemo6 {
    public static void main(String[] args) {
        //注意 1：当调用者是文件时 会返回一个null
        //2.当调用者是空文件夹时 返回一个长度为0的数组
        //3.当调用者是有内容的文件夹时 将所有的文件和文件夹路径放在数组中返回 （包括隐藏文件）
        //4.当调用者是一个有权限才能进入的文件夹时 返回null

        File file =new File("D:\\");
        File[] files = file.listFiles();//返回值是一个file类型的数组
        for (File path : files) {
            System.out.println(path);
        }

    }
}

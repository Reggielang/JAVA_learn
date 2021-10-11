package FileClass;

import java.io.File;
import java.io.IOException;

public class FileDemo8 {
    public static void main(String[] args) throws IOException {
        //delete方法删除文件夹 --删除多级文件夹
        //先删除文件夹里的所有内容，最后再删除文件夹
        File src = new File("C:\\Users\\REGGIE\\Desktop\\src");
        deleteDir(src);
    }

    private static void deleteDir(File src) {
        //先删除文件夹里的所有内容
        //递归
        //注意：可以解决所有文件夹和递归结合的题目
        //1.进入 得到src文件夹里面所有内容的file对象
        File[] files = src.listFiles();

        //2.遍历 得到src文件夹里的所有文件夹和文件对象
        for (File file : files) {
            //3.判断 如果遍历的file对象时一个文件，那么直接删除
            if (file.isFile()){
                file.delete();
            }else {
                //4.判断 -递归
                deleteDir(file); //参数一定是src文件夹里面的文件夹对象
            }
        }
        //最后再删除文件夹
        src.delete();
    }
}

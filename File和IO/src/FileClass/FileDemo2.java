package FileClass;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
    //这个路径固定不会变了
        File file = new File("D:\\大数据相关学习\\JAVA\\a.txt");

        //当前项目下的a.txt
        File file2 = new File("a.txt");

        //当前模块下的a.txt 指定模块下的a.txt
        File file3 = new File("JAVA\\a.txt");
    }
}

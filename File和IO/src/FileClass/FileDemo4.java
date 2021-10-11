package FileClass;

import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {
        method1();
//注意：1.删除是直接从磁盘删除，没有在回收站 2.如果删除的文件，那么直接删除，如果删除的是文件夹，那么只能删除空的文件夹
        //3.简单来说，只能删除空文件，和空文件夹
        File file = new File("D:\\大数据相关学习\\JAVA\\testdelete");
        boolean delete = file.delete();
        System.out.println(delete);

    }

    private static void method1() {
        File file = new File("D:\\大数据相关学习\\JAVA\\a.txt");
        boolean delete = file.delete();
        System.out.println(delete);

    }
}

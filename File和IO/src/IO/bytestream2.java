package IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class bytestream2 {
    public static void main(String[] args) throws IOException {
        //1、创建字节流输出对象 --告诉虚拟机，往哪个文件中写数据了
        //--如果文件是存在的，会把文件清空 r如果不存在，会自动创建出来
//        FileOutputStream fos = new FileOutputStream("D:\\a.txt");
        FileOutputStream fos = new FileOutputStream(new File("D:\\大数据相关学习\\JAVA\\b.txt"));

        //2、写数据 转递一个整数，那么实际上写入文件中，是这个整数在码表中对应的字符
        fos.write(97);

        //3、释放资源  -- 告诉操作系统，现在已经不用这个文件了。
        fos.close();
    }
}

package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class bytestream6 {
    public static void main(String[] args) throws IOException {
        //1、如果文件存在，那么不会报错。2.如果文件不存在，那么就会报错
//        FileInputStream fos = new FileInputStream("D:\\a.txt");
        FileInputStream fos = new FileInputStream("File和IO\\b.txt");
        //2、读数据
        int read = fos.read();
        //一次读取一个字节，返回值就是本次读到的那个字节数据，也就是字符在码表对应的数字，
        // 如果想要看到原字符，那么需要强转为char
        System.out.println((char)read);
        //3、释放资源  -- 告诉操作系统，现在已经不用这个文件了。
        fos.close();
    }
}

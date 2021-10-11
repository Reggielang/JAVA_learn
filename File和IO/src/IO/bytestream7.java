package IO;

import java.io.FileInputStream;
import java.io.IOException;

public class bytestream7 {
    public static void main(String[] args) throws IOException {
        //1、如果文件存在，那么不会报错。2.如果文件不存在，那么就会报错
//        FileInputStream fis = new FileInputStream("D:\\a.txt");
        FileInputStream fis = new FileInputStream("File和IO\\b.txt");
        //2、读数据

        //1.文件多个字节怎么办
//        while (true){
//            int read = fis.read();
//            System.out.println((char)read);
//        }
        int b;
        while ((b = fis.read())!=-1){
            System.out.println((char)b);
        }
        //3、释放资源  -- 告诉操作系统，现在已经不用这个文件了。
        fis.close();
    }
}

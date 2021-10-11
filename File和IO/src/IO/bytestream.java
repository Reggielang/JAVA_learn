package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class bytestream {
    public static void main(String[] args) throws IOException {
        //1、创建字节流输出对象 --告诉虚拟机，往哪个文件中写数据了
//        FileOutputStream fos = new FileOutputStream("D:\\a.txt");
        FileOutputStream fos = new FileOutputStream(new File("D:\\a.txt"));

        //2、写数据
        fos.write(97);

        //3、释放资源
        fos.close();
    }
}

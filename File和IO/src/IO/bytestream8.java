package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class bytestream8 {
    public static void main(String[] args) throws IOException {
        //复制文件 --先读，再写
        FileInputStream fis = new FileInputStream("D:\\a.txt");
        //创建字节输出流，准备写数据
        FileOutputStream fos = new FileOutputStream("File和IO\\a.txt");
        //读文件并直接写入
        int b;
        while ((b = fis.read())!=-1){
            fos.write(b);
        }
        //3、释放资源  -- 告诉操作系统，现在已经不用这个文件了。
        fis.close();
        fos.close();



    }
}

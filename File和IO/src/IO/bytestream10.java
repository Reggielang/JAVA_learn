package IO;

import java.io.*;

public class bytestream10 {
    public static void main(String[] args) throws IOException {
        //利用缓冲流来拷贝文件
        //创建字节缓冲输入流 -创建了一个默认长度为8192的字节流数组
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("File和IO\\a.txt"));
        //创建字节缓冲输出流 -创建了一个默认长度为8192的字节流数组
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("File和IO\\copy.txt")) ;

        //读文件
        int b;
        while ((b = bis.read())!=-1)
                bos.write(b);

        //3、释放资源  -- 告诉操作系统，现在已经不用这个文件了
        //方法的底层会把字节流关闭
        bis.close();
        bos.close();



    }
}

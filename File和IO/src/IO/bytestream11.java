package IO;

import java.io.*;

public class bytestream11 {
    public static void main(String[] args) throws IOException {
        //利用缓冲流结合数组来拷贝文件
        //创建字节缓冲输入流 -创建了一个默认长度为8192的字节流数组
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("File和IO\\a.txt"));

        //创建字节缓冲输出流 -创建了一个默认长度为8192的字节流数组
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("File和IO\\copy.txt")) ;

        //读文件
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes))!=-1)
                bos.write(bytes,0,len);
        //3、释放资源  -- 告诉操作系统，现在已经不用这个文件了
        //方法的底层会把字节流关闭
        bis.close();
        bos.close();



    }
}

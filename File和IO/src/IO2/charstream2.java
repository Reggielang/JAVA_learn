package IO2;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
/*
gbk WIN默认编码格式，一个字符两个字节
utf-8 idea默认的编解码格式，一个中文三个字节
乱码问题：因为字节流都是一次读取一个字节，不管是GBK还是utf-8一个中文都是多个字节，用字节流每次只能读取其中一部分
所以出现了乱码

1.要拷贝，一律使用字节流或者字节缓冲流

2.想要把文本文件中的数据读到内存中，请使用字符输入流
想要把内存中的数据写到文本文件中，请使用字符输出流

 */
public class charstream2 {
    public static void main(String[] args) throws IOException {
        String s = "兵精粮足";
        //利用idea默认的utf-8将中文编码为一系列的字节
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));

//        byte[] bytes2 = s.getBytes("UTF-8");
        byte[] bytes2 = s.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));
    }
}

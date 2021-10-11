package otherIO;

import java.io.*;
import java.nio.charset.Charset;

public class Converteddemo {
    public static void main(String[] args) throws IOException {
        method1();
        method2();
        //在JDK11后，字符流推出了一个构造，也可以指定编码表
//        FileReader fr = new FileReader("C:\\Users\\REGGIE\\Desktop\\a.txt", Charset.forName("gbk"));

    }

    private static void method2() throws IOException {
        //文件是什么码表，就要使用什么码表去读取--指定GBK码表读取文件
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\REGGIE\\Desktop\\a.txt"),"GBK");
        int ch;
        while ((ch=isr.read())!=-1){
            System.out.println((char) ch);
        }
        isr.close();

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\REGGIE\\Desktop\\b.txt"),"UTF-8");
        osw.write("我爱学习，搞快点");
        osw.close();
    }

    //直接读取会乱码，文件是GBK码表，IDEA默认是UTF-8，两者不一致，导致乱码
    private static void method1() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\REGGIE\\Desktop\\a.txt");
        int ch;
        while ((ch = fr.read())!=-1){
            System.out.println((char) ch);
        }
        fr.close();
    }
}

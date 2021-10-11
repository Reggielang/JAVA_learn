package IO2;

import java.io.FileReader;
import java.io.IOException;

/*

 */
public class charstream7 {
    public static void main(String[] args) throws IOException {
        //创建字符输入流对象
        FileReader fr = new FileReader("File和IO\\a.txt");

        //读取数据 --一次读取多个字符

        //创建一个数组 read一次读取多个字符，把字符存入数组，返回值，表示本次读取了多少个字符
        char[] chars = new char[1024];
        int len;
        while ((len=fr.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }

        //释放资源 关闭流之后就不能继续写入数据
        fr.close();
    }
}

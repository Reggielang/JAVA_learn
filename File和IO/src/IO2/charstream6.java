package IO2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*

 */
public class charstream6 {
    public static void main(String[] args) throws IOException {
        //创建字符输入流对象
        FileReader fr = new FileReader("File和IO\\a.txt");

        //读取数据- 一次读一个字符
        int ch;
        while ((ch = fr.read())!=-1){
            System.out.println((char) ch);
        }


        //释放资源 关闭流之后就不能继续写入数据
        fr.close();
    }
}

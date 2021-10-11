package IO2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/*

 */
public class charstream3 {
    public static void main(String[] args) throws IOException {
        //创建字符输出流对象
//        FileWriter fw = new FileWriter(new File("File和IO\\a.txt"));
        FileWriter fw = new FileWriter("File和IO\\a.txt");

//        //写数据 -一次写一个字符
//        fw.write(97);
//        fw.write(98);
//        fw.write(99);

        //一次写一个字符数组
//        char[] chars ={97,98,99,100};
//        fw.write(chars);

        //一此写一个字符数组的一部分
//        char[] chars = {97,98,99,100,101,102};
//        fw.write(chars,0,3);

        //写一个字符串
//        String s = "守土一方";
//        fw.write(s);

        //写一个字符串的一部分
        String s= "守土一方";
        fw.write(s,0,2);

        //释放资源
        fw.close();
    }
}

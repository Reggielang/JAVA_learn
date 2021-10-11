package IO2;

import java.io.FileWriter;
import java.io.IOException;

/*

 */
public class charstream4 {
    public static void main(String[] args) throws IOException {
        //创建字符输出流对象 --1.如果文件不存在就创建文件，但必须保证父级路径存在。并且会清空文件再写入
//        FileWriter fw = new FileWriter(new File("File和IO\\a.txt"));
        FileWriter fw = new FileWriter("File和IO\\aaa\\a.txt");


        //写一个字符串
        String s = "守土一方";
        fw.write(s);
        fw.write(97);//整数对应的码表字符
        fw.write("97");//直接写出字符串即可

        
        //释放资源
        fw.close();
    }
}

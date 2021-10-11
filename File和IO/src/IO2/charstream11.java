package IO2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*

 */
public class charstream11 {
    public static void main(String[] args) throws IOException {
        //字符缓冲输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("File和IO\\a.txt"));

        //写入数据
        bw.write("ssssssssssssssssssssssssssssssssssssssss");
        bw.newLine();//换行符
        bw.write("wwwwwwwwwwwwwwwwwwwwwwwwwwww");
        bw.close();
    }
}

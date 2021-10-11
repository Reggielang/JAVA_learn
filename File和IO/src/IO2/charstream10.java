package IO2;

import java.io.*;

/*

 */
public class charstream10 {
    public static void main(String[] args) throws IOException {
        //字符缓冲输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("File和IO\\a.txt"));

        //写入数据
        bw.write("ssssssssssssssssssssssssssssssssssssssss");

        bw.flush();
        char[] chars = {97,98,99,100,101};
        bw.write(chars);

        bw.close();
    }
}

package IO2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*

 */
public class charstream9 {
    public static void main(String[] args) throws IOException {
        //字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("File和IO\\a.txt"));

        //读取数据
        char[] chars = new char[1024];
        int len;
        while ((len = br.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }

        br.close();
    }
}

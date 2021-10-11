package IO2;

import java.io.*;

/*

 */
public class charstream12 {
    public static void main(String[] args) throws IOException {
        //字符缓冲输出流
        BufferedReader br = new BufferedReader(new FileReader("File和IO\\a.txt"));

        //readLine读一整行 读到回车换行为止
//        String line1 = br.readLine();
//        String line2 = br.readLine();
//        String line3 = br.readLine();
//        String line4 = br.readLine();
//
//        System.out.println(line1);
//        System.out.println(line2);
//        System.out.println(line3);
//        System.out.println(line4);

        //使用循环
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}

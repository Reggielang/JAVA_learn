package otherIO;

import java.io.*;
/*
对象操作流，可以把对象以字节的形式写到本地文件，直接打开文件是看不懂的，需要读取到内存中
 */
public class Converteddemo2 {
    public static void main(String[] args) throws IOException {
        User user = new User("zhangsan","123456");
        BufferedWriter bw = new BufferedWriter(new FileWriter("File和IO\\user.txt"));
        bw.write(user.getUsername());
        bw.newLine();
        bw.write(user.getPasswd());
        bw.newLine();
        bw.close();
    }
}

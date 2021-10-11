package IO2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*

 */
public class charstream8 {
    public static void main(String[] args) throws IOException {

        //实现键盘录入用户名和密码
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入用户名");

        String username = scan.next();
        System.out.println("请输入密码");
        String passwd = scan.next();

        //创建字符输入流对象
        FileWriter fw = new FileWriter("File和IO\\c.txt");

        //保存到本地文件
        fw.write(username+"\r\n"+passwd);

        //释放资源 关闭流之后就不能继续写入数据
        fw.close();
    }
}

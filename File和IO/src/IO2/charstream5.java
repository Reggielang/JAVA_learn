package IO2;

import java.io.FileWriter;
import java.io.IOException;

/*

 */
public class charstream5 {
    public static void main(String[] args) throws IOException {
        //创建字符输出流对象
        FileWriter fw = new FileWriter("File和IO\\a.txt");

        //写一个字符串
        fw.write("守土一方");
        fw.flush();//刷新 刷新后还可以继续写入数据
        fw.write("999");
        fw.flush();
        
        //释放资源 关闭流之后就不能继续写入数据
        fw.close();
    }
}

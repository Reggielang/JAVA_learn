package IO2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class charstream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("File和IO\\b.txt");

        int b;
        while ((b=fis.read())!=-1){
            System.out.println((char)b);
        }
        //3、释放资源  -- 告诉操作系统，现在已经不用这个文件了。
        fis.close();
    }
}

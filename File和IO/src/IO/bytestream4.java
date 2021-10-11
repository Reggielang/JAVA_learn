package IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class bytestream4 {
    public static void main(String[] args) throws IOException {
        //第二个参数为续写开关-- 追加写入数据 --不清空文件，直接写入 true表示打开，false表示关闭续写
        FileOutputStream fos = new FileOutputStream(new File("File和IO\\b.txt"),true);

        fos.write(97);
        fos.write("\r\n".getBytes());
        fos.write(98);
        fos.write("\r\n".getBytes());
        fos.write(99);
        fos.write("\r\n".getBytes());
        fos.write(100);




        fos.close();
    }
}

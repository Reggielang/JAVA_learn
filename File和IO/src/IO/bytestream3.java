package IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class bytestream3 {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream(new File("File和IO\\b.txt"));

//        fos.write(97);
//        fos.write(98);
//        fos.write(99);

        byte[] bys = {97,98,99,100,101,102,103};
//        一次写入一个数组
        fos.write(bys);
//      一次写入一个数组的一部分
        fos.write(bys,1,2);

        fos.close();
    }
}

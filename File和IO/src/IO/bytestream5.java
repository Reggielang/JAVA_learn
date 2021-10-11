package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class bytestream5 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try{
//            System.out.println(2/0);
            fos = new FileOutputStream(new File("File和IO\\b.txt"),true);
            fos.write(97);
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            //finally里面的代码，一定会被执行
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

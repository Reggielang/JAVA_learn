package FileClass;

import java.io.File;
import java.io.IOException;

public class FileDemo7 {
    public static void main(String[] args) throws IOException {
        //注意：createNewFile创建一个文件！文件所在的文件夹必须要存在
//        File file =new File("File和IO\\aaa\\a.txt");
        File file =new File("File和IO\\\\aaa");
        if (!file.exists()){
            //如果文件夹不存在就创建
            file.mkdirs();
        }
        File newfile = new File(file,"a.txt");
        newfile.createNewFile();
    }
}

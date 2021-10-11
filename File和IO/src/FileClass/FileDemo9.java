package FileClass;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class FileDemo9 {
    public static void main(String[] args) throws IOException {
        //统计一个文件夹中，每种文件的出现个数
        File file = new File("File和IO");
        //利用map集合进行数据统计，键--文件后缀名， 值---次数
        HashMap<String,Integer> hm = new HashMap<>();
        getCount(hm,file);
        System.out.println(hm);
    }
    private static void getCount(HashMap<String, Integer> hm, File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()){
                String filename = f.getName();
                String[] filenameArr = filename.split("\\.");
                if (filenameArr.length ==2){
                    String fileendname = filenameArr[1];
                    if (hm.containsKey(fileendname)){
                        //已经存在
                        Integer count = hm.get(fileendname);
                        count++; //文件又出现了一次
                        hm.put(fileendname,count);
                    }else {
                        //不存在 --当前文件第一次出现
                        hm.put(fileendname,1);
                    }
                }
            }else {
                getCount(hm,f);
            }
        }
    }


}

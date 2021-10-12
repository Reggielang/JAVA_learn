package Properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
是一个Map体系的集合类
有跟IO相关的方法
只存字符串
 */
public class Propertiesdemo3 {
    public static void main(String[] args) throws IOException {
        load();

        store();


    }



    private static void load() throws IOException {
        Properties prop = new Properties();
        //load将本地文件中的键值对数据读取到集合中
        FileReader fr = new FileReader("File和IO\\load.properties");
        prop.load(fr); //调用load方法后文件中的键值对数据已经在集合中了
        fr.close();

        System.out.println(prop);
    }
    private static void store() throws IOException {
        Properties prop = new Properties();
        prop.put("张三","123");
        prop.put("lisi","123");
        prop.put("wangwu","123");

        FileWriter fw = new FileWriter("File和IO\\store.properties");
        prop.store(fw,null);
        fw.close();
    }
}

package Properties;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*
是一个Map体系的集合类
有跟IO相关的方法
只存字符串
 */
public class Propertiesdemo2 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("江苏","南京");
        prop.setProperty("安徽","南京");
        prop.setProperty("山东","济南");

        System.out.println(prop);

        String value = prop.getProperty("江苏");
        System.out.println(value);

        Set<String> keys = prop.stringPropertyNames();
        for (String key : keys) {
            String value1 = prop.getProperty(key);
            System.out.println(key+"="+value1);
        }

    }
}

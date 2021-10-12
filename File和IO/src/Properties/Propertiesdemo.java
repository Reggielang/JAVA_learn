package Properties;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*
是一个Map体系的集合类
有跟IO相关的方法
只存字符串
 */
public class Propertiesdemo{
    public static void main(String[] args) {
        Properties prop = new Properties();
        //增
        prop.put("小龙女","奥特曼");
        prop.put("黄蓉","欧阳靖");
        prop.put("存储","哇塞");
        System.out.println(prop);

        //删
        prop.remove("存储");
        System.out.println(prop);

        //改
        //put --如果键不存在，添加，如果键存在就修改值
        prop.put("小龙女","杨过");
        System.out.println(prop);

        //查
        Object value = prop.get("黄蓉");
        System.out.println(value);

        //遍历
        Set<Object> keys = prop.keySet();
        for (Object key : keys) {
            Object o = prop.get(key);
            System.out.println(key+"="+o);
        }

        //装的是键值对对象
        Set<Map.Entry<Object, Object>> set = prop.entrySet();
        for (Map.Entry<Object, Object> entry : set) {
            Object key = entry.getKey();
            Object value1 = entry.getValue();
            System.out.println(key+"="+value1);
        }
    }
}

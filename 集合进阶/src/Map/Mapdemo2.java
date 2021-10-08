package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapdemo2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("ID001","小智");
        map.put("ID002","小智2");
        map.put("ID003","小智3");
        map.put("ID004","小智4");
        map.put("ID005","小智5");

        //获取所有的键
        Set<String> keys = map.keySet();

        //遍历Set集合得到每一个键
        for (String key : keys) {
            //通过每一个键key,来获取相应的值
            String value = map.get(key);
            System.out.println(value);
        }

        //entrySet,获取所有的键值对对象
        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+","+entry.getValue());
        }


    }
}

package Map;

import java.util.HashMap;
import java.util.Map;

public class Mapdemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        //如果要添加的键不存在，那么会把键值对都添加到集合中，如果添加的键是存在的，那么会覆盖原来的值，把原来的值当做返回值返回。
        map.put("ID001","小智");
        map.put("ID002","小智2");
        map.put("ID003","小智3");
        map.put("ID004","小智4");
        map.put("ID005","小智5");
        String s = map.put("ID005", "aaa");
        System.out.println(s);
        System.out.println(map);

        //remove
        String remove = map.remove("ID005");
        System.out.println(remove);
        System.out.println(map);

        //clear() 清空当前集合
//        map.clear();

        //boolean containsKey()
        boolean result = map.containsKey("ID001");
        System.out.println(result);

        //boolean containsValue()
        boolean result2 = map.containsValue("小智");
        System.out.println(result2);

        //boolean isEmpty()
        boolean result3 = map.isEmpty();
        System.out.println(result3);

        //int size()
        int size = map.size();
        System.out.println(size);


    }
}

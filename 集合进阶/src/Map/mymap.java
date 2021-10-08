package Map;

import java.util.HashMap;
import java.util.Map;

public class mymap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("ID001","小明");
        map.put("ID002","小美");
        map.put("ID003","小新");

        System.out.println(map);
    }
}

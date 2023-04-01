import com.alibaba.fastjson.JSONObject;

import java.util.Iterator;
import java.util.Map;

public class IteratorExample {
    public static void main(String[] args) {
        JSONObject animalJson = new JSONObject();
        animalJson.put("dog","black");
        animalJson.put("cat","white");
        animalJson.put("mouse","grey");

        Iterator<Map.Entry<String, Object>> iterator  = animalJson.entrySet().iterator();
//      遍历set集合
        while (iterator.hasNext()){
            Map.Entry<String, Object> entry = iterator.next();
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("key:" + key + ",values:" + value);

        }

    }

}

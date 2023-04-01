import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JSONTest {

    public static void main(String[] args) {
        String jsonStr = "{\"ywsdx\": {\"ywfxdj\": \"1\",\"khkjsksl\": \"\",\"slywlb\": \"42\",\"sdxjg\": \"0\",\"tzqxsdx\": \"1\",\"cxywlb\": \"3\",\"khtzpz\": \"3;4;5\",\"khtzqx\": \"1;2;3\",\"tzpzsdx\": \"0\",\"khyqsy\": \"\",\"ywtzpz\": \"1\",\"ywzdksl\": \"\",\"khfxdj\": \"6\",\"ywtzqx\": \"1\",\"fxdjsdx\": \"1\",\"hzbz\": \"1\",\"ywyqsy\": \"\",\"kslsdx\": \"1\"}}";

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);

        Map.Entry<String, Object> entry = jsonObject.entrySet().iterator().next();
        JSONObject value = (JSONObject) entry.getValue();
        List<JSONObject> list = new ArrayList<>();
        list.add(value);
        value.put("ywsdx_list", list);
        String result = jsonObject.toJSONString();
        System.out.println(result);
    }
}

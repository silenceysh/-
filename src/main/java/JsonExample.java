import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JsonExample {
    public static void main(String[] args) {
        JSONArray jsonArray = JSONArray.parseArray("[{\"yjyqx\":\"21;71\",\"jyqx\":\"7;21;71\",\"jys\":\"1\",\"gdh\":\"A334469426\"},{\"yjyqx\":\"21;71\",\"jyqx\":\"7;21;71\",\"jys\":\"2\",\"gdh\":\"0188679224\"}]");
        Set<String> xzjyqxSet = new HashSet<>();
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject obj = jsonArray.getJSONObject(i);
            String yjyqx = obj.getString("yjyqx");
            String jyqx = obj.getString("jyqx");
            String[] jyqxArr = jyqx.split(";");
                for (String qx : jyqxArr) {
                if (!(";" + yjyqx + ";").contains(qx + ";")) {
                    xzjyqxSet.add(qx);
                }
            }
        }
        String xzjyqx = String.join(";", xzjyqxSet);
        JSONObject result = new JSONObject();
        result.put("xzjyqx", xzjyqx);
        System.out.println(result);

    }
}

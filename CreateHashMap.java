import java.util.HashMap;

public class CreateHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        System.out.println("The HashMap contains:");
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}

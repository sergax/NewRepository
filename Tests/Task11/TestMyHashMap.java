package Task11;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class TestMyHashMap {
    @Test
    void putOnMyHashMAp() {
        MyHashMap<String, String> map = new MyHashMap<>();
        map.put("A", "B");
        map.put("A", "B");
        map.put("A", "B");
        map.put("A", "B");

        System.out.println(map.getValueByKey("A"));
    }
}

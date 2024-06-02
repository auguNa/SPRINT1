package S1_04.N3Ejercicio5;

import org.assertj.core.api.Assertions;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");


        System.out.println("Map content: " + map);


        Assertions.assertThat(map).containsKey("key1");

        System.out.println("Assertion passed: The map contains the key 'key1'.");
    }
}


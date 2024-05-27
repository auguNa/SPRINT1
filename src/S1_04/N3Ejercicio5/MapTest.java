package S1_04.N3Ejercicio5;

import org.assertj.core.api.Assertions;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        // Step 1: Create a map and add a key-value pair
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");

        // Step 2: Print the map content to show the test process
        System.out.println("Map content: " + map);

        // Step 3: Verify the map contains the specific key using AssertJ
        Assertions.assertThat(map).containsKey("key1");

        // Print a success message if the assertion passes
        System.out.println("Assertion passed: The map contains the key 'key1'.");
    }
}


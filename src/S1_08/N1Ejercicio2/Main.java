package S1_08.N1Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("OpenAI");
        strings.add("Amazon");
        strings.add("Java");
        strings.add("Python");

        List<String> stringsWithOAndLengthGreaterThan5 = findStringsWithOAndLengthGreaterThan5(strings);
        System.out.println("Strings containing 'o' and length greater than 5: " + stringsWithOAndLengthGreaterThan5);
    }

    public static List<String> findStringsWithOAndLengthGreaterThan5(List<String> strings) {
        return strings.stream()
                .filter(str -> str.contains("o") && str.length() > 5)
                .collect(Collectors.toList());
    }
}

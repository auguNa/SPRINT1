package S1_08.N1Ejercicio1;


import java.util.List;
import java.util.stream.Collectors;

public class StringFinder {
    public static List<String> findStringsWithO(List<String> strings) {
        return strings.stream()
                .filter(str -> str.contains("o"))
                .collect(Collectors.toList());
    }

}

package S1_08.N2Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Amy");
        names.add("Ava");
        names.add("Alex");
        names.add("Ann");
        names.add("Al");
        names.add("agu");

        List<String> filteredNames = filterNames(names);
        filteredNames.forEach(System.out::println);
    }

    public static List<String> filterNames(List<String> names) {
        return names.stream()
                .filter(name -> name.startsWith("A") && name.length() == 3)
                .collect(Collectors.toList());
    }
}

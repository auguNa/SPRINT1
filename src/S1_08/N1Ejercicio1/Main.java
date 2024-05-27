package S1_08.N1Ejercicio1;

import java.util.*;

import static S1_08.N1Ejercicio1.StringFinder.findStringsWithO;


public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Barcelona");
        strings.add("Golf");

        List<String> stringsWithO = findStringsWithO(strings);
        System.out.println("Strings containing 'o': " + stringsWithO);
    }
}

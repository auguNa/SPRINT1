package S1_08.N2Ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Create a list containing some text strings and numbers as strings
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("42");
        list.add("element");
        list.add("20");
        list.add("test");
        list.add("11");
        list.add("example");
        list.add("car");

        // Sort strings containing an "e" first, then alphabetically by their first character
        List<String> sortedWithEFirst = porLetraE(list);

        // Modify all elements that have an 'a' to change 'a' to '4'
        List<String> modifiedList = sortedWithEFirst.stream()
                .map(s -> s.replace('a', '4'))
                .collect(Collectors.toList());

        // Show only elements that are numeric
        List<String> numericElements = modifiedList.stream()
                .filter(s -> s.matches("\\d+"))
                .collect(Collectors.toList());

        // Print the results
        System.out.println("Sorted with 'e' first: " + sortedWithEFirst);
        System.out.println("Modified list (a -> 4): " + modifiedList);
        System.out.println("Numeric elements: " + numericElements);
    }

    public static List<String> porLetraE(List<String> cadena) {
        return cadena.stream()
                .sorted((a, b) -> {
                    if (a.contains("e") && !b.contains("e")) {
                        return -1; // 'a' comes before 'b' if 'a' contains 'e' and 'b' does not
                    } else if (!a.contains("e") && b.contains("e")) {
                        return 1; // 'a' comes after 'b' if 'a' does not contain 'e' and 'b' does
                    } else {
                        return a.compareTo(b); // Alphabetical order if both contain "e" or both don't contain "e"
                    }
                })
                .collect(Collectors.toList());
    }
}


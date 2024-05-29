package S1_08.N2Ejercicio4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
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

        // Sort alphabetically by their first character
        List<String> sortedByFirstChar = list.stream()
                .sorted((s1, s2) -> Character.compare(s1.charAt(0), s2.charAt(0)))
                .collect(Collectors.toList());

        // Sort strings containing an "e" first
        List<String> sortedWithEFirst = list.stream()
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String s1, String s2) {
                        boolean s1StartWithE = s1.startsWith("e");
                        boolean s2StartWithE = s2.startsWith("e");
                        if (s1StartWithE && !s2StartWithE) {
                            return -1;
                        } else if (!s1StartWithE && s2StartWithE) {
                            return 1;
                        } else {
                            return s1.compareTo(s2);
                        }
                    }
                })
                .collect(Collectors.toList());

        // Modify all elements that have an 'a' to change 'a' to '4'
        List<String> modifiedList = sortedWithEFirst.stream()
                .map(s -> s.replace('a', '4'))
                .collect(Collectors.toList());

        // Show only elements that are numeric
        List<String> numericElements = modifiedList.stream()
                .filter(s -> s.matches("\\d+"))
                .collect(Collectors.toList());

        System.out.println("Sorted by first character: " + sortedByFirstChar);
        System.out.println("Sorted with 'e' first: " + sortedWithEFirst);
        System.out.println("Modified list (a -> 4): " + modifiedList);
        System.out.println("Numeric elements: " + numericElements);
    }
}
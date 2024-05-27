package S1_08.N1Ejercicio6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> mixedList = new ArrayList<>();
        mixedList.add("banana");
        mixedList.add("apple");
        mixedList.add(10);
        mixedList.add("orange");
        mixedList.add(5);
        mixedList.add("grape");

        // Sort the list based on the length of strings
        mixedList.sort(Comparator.comparing(Object::toString, Comparator.comparingInt(String::length)));

        // Print the sorted list
        System.out.println("Sorted list: " + mixedList);
    }
}

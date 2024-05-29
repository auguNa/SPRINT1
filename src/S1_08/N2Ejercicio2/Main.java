package S1_08.N2Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(3, 55, 44));
        String result = formatNumbers(numbers);
        System.out.println("Print First List: " + result);


        List<Integer> numbers2 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        String result1 = formatNumbers(numbers2);
        System.out.println("Print Second List: " + result1);

    }

    public static String formatNumbers(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> (number % 2 == 0 ? "e" : "o") + number)
                .collect(Collectors.joining(", "));
    }
}


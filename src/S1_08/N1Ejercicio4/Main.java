package S1_08.N1Ejercicio4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> months = Arrays.asList(
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        );

        // Printing all elements in the list using method reference
        months.forEach(System.out::println);
    }
}

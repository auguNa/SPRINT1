package S1_04.N3Ejercicio7;

import org.assertj.core.api.*;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        // Step 1: Create an empty Optional object
        Optional<String> optional = Optional.empty();

        // Step 2: Verify that the Optional is empty using AssertJ
        Assertions.assertThat(optional).isEmpty();

        // Print a success message if the assertion passes
        System.out.println("Assertion passed: The Optional is empty.");
    }
}
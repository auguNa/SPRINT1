package S1_04.N3Ejercicio7;

import org.assertj.core.api.*;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {

        Optional<String> optional = Optional.empty();


        Assertions.assertThat(optional).isEmpty();


        System.out.println("Assertion passed: The Optional is empty.");
    }
}
package S1_04.N1Ejercicio2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculateDNITest {
    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "87654321, X",
            "11111111, H",
            "22222222, J",
            "33333333, P",
            "44444444, T",
            "55555555, R",
            "66666666, Q",
            "77777777, V",
            "51117497, C"
    })
    public void testCalculateDniLetter(int dniNumber, char expectedLetter) {
        assertEquals(expectedLetter, CalculateDNI.calculateDniLetter(dniNumber));
    }
}


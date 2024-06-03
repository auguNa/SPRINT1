package S1_04.N2Ejercicio1;
import org.junit.jupiter.api.Test;

import static S1_04.N2Ejercicio1.StringLengthMatcher.hasLength;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;

class StringLengthMatcherTest {
    @Test
    public void testStringLength() {
        assertThat("Mordor", not(hasLength(8)));
    }
}

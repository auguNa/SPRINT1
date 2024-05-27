package S1_04.N3Ejercicio6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilTest {
    @Test
    public void testArrayIndexOutOfBoundsException() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {1, 2, 3};

        // Verify that an ArrayIndexOutOfBoundsException is thrown
        assertThatThrownBy(() -> arrayUtil.getElementAtIndex(array, 5))
                .isInstanceOf(ArrayIndexOutOfBoundsException.class)
                .hasMessageContaining("Index 5 out of bounds for length 3");
    }
}
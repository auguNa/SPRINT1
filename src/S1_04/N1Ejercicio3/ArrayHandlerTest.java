package S1_04.N1Ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayHandlerTest {
    @Test
    public void testArray() {
        int[] array = {1, 2, 3};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            ArrayHandler handler = new ArrayHandler();
            handler.getElementAtIndex(array, 3);
        });
    }
}


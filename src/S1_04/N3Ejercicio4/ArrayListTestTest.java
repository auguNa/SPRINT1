package S1_04.N3Ejercicio4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTestTest {

    String str = "Hello";
    Integer num = 42;
    Double dbl = 3.14;
    Boolean bool = true;

    @Test
    public void testArrayList() {
        ArrayList<Object> list = new ArrayList<>();
        list.add(str);
        list.add(num);
        list.add(dbl);
        list.add(bool);

        // Check the order of the objects as they were inserted

        assertEquals(str, list.get(0));
        assertEquals(num, list.get(1));
        assertEquals(dbl, list.get(2));
        assertEquals(bool, list.get(3));

        // Verify that the list contains the objects in any order
        assertTrue(list.contains(str));
        assertTrue(list.contains(num));
        assertTrue(list.contains(dbl));
        assertTrue(list.contains(bool));

        // Verify that each object has been added only once
        assertEquals(1, list.stream().filter(e -> e.equals(str)).count());
        assertEquals(1, list.stream().filter(e -> e.equals(num)).count());
        assertEquals(1, list.stream().filter(e -> e.equals(dbl)).count());
        assertEquals(1, list.stream().filter(e -> e.equals(bool)).count());

        // Verify that an object that was not added is not in the list
        Character ch = 'A';
        assertFalse(list.contains(ch));
    }

}
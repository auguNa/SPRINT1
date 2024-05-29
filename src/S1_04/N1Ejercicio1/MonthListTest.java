package S1_04.N1Ejercicio1;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;


public class MonthListTest extends TestCase {

        @Test
        public void testMonthList() {
            MonthList monthList = new MonthList();
            assertNotNull(monthList.getMonths()); // Verify list is not null
            assertEquals(12, monthList.getMonths().size()); // Verify list has 12 positions
            assertEquals("August", monthList.getMonths().get(7)); // Verify August is at position 8 (index 7)
        }
    }

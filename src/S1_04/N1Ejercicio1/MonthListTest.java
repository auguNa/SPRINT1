package S1_04.N1Ejercicio1;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;


public class MonthListTest extends TestCase {
    MonthList monthList = new MonthList();

    @Test
    public void testMonthList() {
        int expected = 12;
        int actual = monthList.getMonths().size();
        assertEquals(expected, actual);
    }
        @Test
               public void notNullTest() {
            assertNotNull(monthList.getMonths());
        }

        @Test
        public void haveAugustTest() {
            String expected = "August";
            String actual = monthList.getMonths().get(7);
            assertEquals(expected, actual);
        }
    }


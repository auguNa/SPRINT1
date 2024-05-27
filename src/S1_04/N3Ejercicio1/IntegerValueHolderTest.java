package S1_04.N3Ejercicio1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IntegerValueHolderTest {

        public void testValuesAreEqual() {
            IntegerValueHolder holder1 = new IntegerValueHolder(100);
            IntegerValueHolder holder2 = new IntegerValueHolder(100);

            // Assert that the values are equal
            assertThat(holder1.getValue()).isEqualTo( holder2.getValue());
        }

        @Test
        public void testValuesAreNotEqual() {
            IntegerValueHolder holder1 = new IntegerValueHolder(100);
            IntegerValueHolder holder2 = new IntegerValueHolder(200);

            // Assert that the values are not equal
            assertThat(holder1.getValue()).isNotEqualTo(holder2.getValue());

        }
    }
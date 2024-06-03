package S1_04.N3Ejercicio2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {
    @Test
    public void testSameReference() {
        Person person1 = new Person("Alice");
        Person person2 = person1;


        Assertions.assertThat(person1).isSameAs(person2);
    }

    @Test
    public void testDifferentReference() {
        Person person1 = new Person("Alice");
        Person person2 = new Person("Alice");
        //Person person2 = person1;
        Assertions.assertThat(person1).isNotSameAs(person2);
    }

}
package S1_04.N3Ejercicio2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {
    @Test
    public void testSameReference() {
        Person person1 = new Person("Alice");
        Person person2 = person1;  // person2 references the same object as person1

        // This assertion will pass because person1 and person2 reference the same object
        Assertions.assertThat(person1).isSameAs(person2);
    }

    @Test
    public void testDifferentReference() {
        Person person1 = new Person("Alice");
        Person person2 = new Person("Alice");  // person2 is a different object with the same content
        //Person person2 = person1;
        // This assertion will pass because person1 and person2 reference different objects
        Assertions.assertThat(person1).isNotSameAs(person2);
    }

}
package S1_06.N2Ejercicio2;
import S1_06.N2Ejercicio1.Person;

import java.util.ArrayList;
import java.util.List;

import static S1_06.N2Ejercicio2.GenericMethods.printList;


public class Main {
    public static <T> void main(String[] args) {
      Person person = new Person("Rafael", "Nadal", 44);
        List<Person> personList = new ArrayList<>();
        personList.add(person);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);

        printList(integerList);
        printList(personList);
    }
}

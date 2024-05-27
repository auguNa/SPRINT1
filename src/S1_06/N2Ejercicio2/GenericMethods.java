package S1_06.N2Ejercicio2;

import java.util.List;

public class GenericMethods<T> {
    public static void printList(List<?> myList1) {
        System.out.println(myList1);
    }
}

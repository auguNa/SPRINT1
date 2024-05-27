package S1_03.N1Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            firstList.add(i);
        }

        // Imprimir la primera lista
        System.out.println("First List:");
        for (Integer number : firstList) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Crear la segunda lista
        List<Integer> secondList = new ArrayList<>();

        // Usar un ListIterator para recorrer la primera lista en orden inverso
        ListIterator<Integer> listIterator = firstList.listIterator(firstList.size());
        while (listIterator.hasPrevious()) {
            Integer number = listIterator.previous();
            secondList.add(number);
        }

        // Imprimir la segunda lista
        System.out.println("Second List: ");
        for (Integer number : secondList) {
            System.out.print(number + " ");
        }
    }
}


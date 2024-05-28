package S1_03.N1Ejercicio1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "September", "October", "November", "December"};
        Month august = new Month("August");


        ArrayList<Month> year = new ArrayList<>();
        for (int i = 0; i < months.length; i++) {
            year.add(new Month(months[i]));
        }
        for (int i = 0; i < year.size(); i++) {
            Month month = year.get(i);
            System.out.print(month.getMonth() + ", ");
        }
        System.out.println("\n\nAdding August to arrayList.");
        year.add(7, august);

        for (Month month : year) {
            System.out.print(month.getMonth() + ", ");
        }
        System.out.println("\n\nTransform the array to hashSet & Iterations.");
        LinkedHashSet<Month> hashYear = new LinkedHashSet<>(year);
        hashYear.addAll(year);
        hashYear.add(august);// This should not be added as it's a duplicate

        System.out.println("Iteration with 'Iterator':");
        Iterator<Month> monthsIterator = hashYear.iterator();
        while (monthsIterator.hasNext()) {
            System.out.print(monthsIterator.next().getMonth() + ", ");
        }
        System.out.println("\nIteration with 'for': ");
        for (Month month : hashYear) {
            System.out.print(month.getMonth() + ", ");
        }
    }
}

package S1_03.N1Ejercicio1;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "September", "October", "November", "December"};
        Month august = new Month("August");
        Month noName = new Month("NoName");

        ArrayList<Month> year = new ArrayList<>();
        for (int i = 0; i < months.length; i++) {
            year.add(new Month(months[i]));
        }
        for (int i = 0; i < year.size(); i++) {
            Month month = year.get(i);
            System.out.println(month.getMonth());
        }

        year.add(7, august);
        for (Month month : year) {
            System.out.print(month.getMonth() + ", ");
        }
        Set<Month> hashYear = new LinkedHashSet<>(year);
        hashYear.add(august);
        hashYear.add(noName);

        System.out.println("\n'Iterator' Iteration:");
        Iterator<Month> monthsIterator = hashYear.iterator();
        while (monthsIterator.hasNext()) {
            System.out.println(monthsIterator.next().getMonth());
        }
        System.out.println("'for' Iteration:");
        for (Month month : hashYear) {
            System.out.print(month.getMonth() + ", ");
        }
    }
}

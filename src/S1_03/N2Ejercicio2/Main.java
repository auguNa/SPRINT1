package S1_03.N2Ejercicio2;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Restaurant> restaurants = new TreeSet<>();

        Restaurant r1 = new Restaurant("Restaurant A", 5);
        Restaurant r2 = new Restaurant("Restaurant A", 3);
        Restaurant r3 = new Restaurant("Restaurant B", 4);
        Restaurant r4 = new Restaurant("Restaurant A", 5); // Duplicate
        Restaurant r5 = new Restaurant("Restaurant C", 5);

        // Add restaurants to the set
        restaurants.add(r1);
        restaurants.add(r2);
        restaurants.add(r3);
        restaurants.add(r4); // This should not be added as it's a duplicate
        restaurants.add(r5);

        System.out.println("Print the sorted list: ");
        for (Restaurant r : restaurants) {
            System.out.println(r);
        }
    }
}


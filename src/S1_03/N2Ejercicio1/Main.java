package S1_03.N2Ejercicio1;



import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Restaurant> restaurants = new HashSet<>();
        Restaurant r1 = new Restaurant("Restaurant A", 5);
        Restaurant r2 = new Restaurant("Restaurant A", 5);
        Restaurant r3 = new Restaurant("Restaurant B", 4);
        Restaurant r4 = new Restaurant("Restaurant A", 3);

        restaurants.add(r1);
        restaurants.add(r2);
        restaurants.add(r3);
        restaurants.add(r4);

        for (Restaurant r : restaurants) {
            System.out.println(r);
        }
    }
}

package S1_07.N2Ejercicio1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);
        try {
            JsonSerializer.serialize(person);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("I/O error: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }
}

package S1_03.N3Ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    public static List<Person> readCSV(String filePath) {
        List<Person> people = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length == 3) {
                    String firstName = values[0];
                    String lastName = values[1];
                    String dni = values[2];
                    people.add(new Person(firstName, lastName, dni));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return people;
    }
}
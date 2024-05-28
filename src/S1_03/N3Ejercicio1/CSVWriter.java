package S1_03.N3Ejercicio1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVWriter {
    public static void writeCSV(String filePath, List<Person> people) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (Person person : people) {
                bw.write(String.format("%s,%s,%s%n", person.getFirstName(), person.getLastName(), person.getDni()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
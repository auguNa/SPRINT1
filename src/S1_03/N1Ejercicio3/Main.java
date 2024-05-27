package S1_03.N1Ejercicio3;

import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> countryCapitalMap = new HashMap<>();
        Random random = new Random();

        // Read the countries and capitals from the file
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\augus\\Desktop\\BCN ACTIVA\\ITAcademy\\Sprint_1\\src\\main\\java\\s01_03\\n1ejercicio3\\countries.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    countryCapitalMap.put(parts[0].trim(), parts[1].trim());
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        Scanner scanner = new Scanner(System.in);

        // Get the user's name
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        int score = 0;
        List<String> countries = new ArrayList<>(countryCapitalMap.keySet());

        // Ask 10 questions
        for (int i = 0; i < 10; i++) {
            String country = countries.get(random.nextInt(countries.size()));
            System.out.print("What is the capital of " + country + "? ");
            String userAnswer = scanner.nextLine().trim();
            String correctAnswer = countryCapitalMap.get(country);

            if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswer + ".");
            }
        }

        // Save the result to classificacio.txt
        String scoreFilePath = "C:\\Users\\augus\\Desktop\\BCN ACTIVA\\ITAcademy\\Sprint_1\\src\\main\\java\\s01_03\\n1ejercicio3\\Score.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(scoreFilePath, true))) {
            bw.write(userName + ": " + score);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        System.out.println("You scored " + score + " points.");
    }
}
package S1_03.N3Ejercicio1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private static void displayPeople(List<Person> people) {
        System.out.printf("%-15s %-20s %-10s%n", "___Name___", "____Surname___", "__NIF__");
        for (Person person : people) {
            System.out.println(person);
        }
    }

    private static void sortPeople(List<Person> people, Comparator<Person> comparator) {
        Collections.sort(people, comparator);
    }

    public static void main(String[] args) {
                String filePath = System.getProperty("user.dir") + "\\src\\s1_03\\N3Ejercicio1\\people.csv";
        List<Person> people = CSVReader.readCSV(filePath);

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.- Enter person.");
            System.out.println("2.- Show people ordered by name (A-Z).");
            System.out.println("3.- Show people ordered by name (Z-A).");
            System.out.println("4.- Show people ordered by last name (A-Z).");
            System.out.println("5.- Show people ordered by last name (Z-A).");
            System.out.println("6.- Show people ordered by ID (1-9).");
            System.out.println("7.- Show people ordered by DNI (9-1).");
            System.out.println("0.- Exit.");

            choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter first name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter last name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter DNI: ");
                    String dni = scanner.nextLine();
                    Person newPerson = new Person(firstName, lastName, dni);
                    people.add(newPerson);
                    CSVWriter.writeCSV(filePath, people); // Write to CSV after adding the new person
                    break;
                case 2:
                    sortPeople(people, Comparator.comparing(Person::getFirstName));
                    displayPeople(people);
                    break;
                case 3:
                    sortPeople(people, Comparator.comparing(Person::getFirstName).reversed());
                    displayPeople(people);
                    break;
                case 4:
                    sortPeople(people, Comparator.comparing(Person::getLastName));
                    displayPeople(people);
                    break;
                case 5:
                    sortPeople(people, Comparator.comparing(Person::getLastName).reversed());
                    displayPeople(people);
                    break;
                case 6:
                    sortPeople(people, Comparator.comparing(Person::getDni));
                    displayPeople(people);
                    break;
                case 7:
                    sortPeople(people, Comparator.comparing(Person::getDni).reversed());
                    displayPeople(people);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        } while (choice != 0);
    }
}
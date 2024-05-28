package S1_03.N3Ejercicio1;

public class Person {
    private String firstName;
    private String lastName;
    private String dni;

    public Person(String firstName, String lastName, String dni) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dni = dni;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-20s %-10s", firstName, lastName, dni);
    }
}
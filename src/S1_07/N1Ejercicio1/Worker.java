package S1_07.N1Ejercicio1;

public class Worker {
    protected String firstName;
    protected String lastName;
    protected double pricePerHour;

    public Worker(String firstName, String lastName, double pricePerHour) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pricePerHour = pricePerHour;
    }

    public double calculateSou(int hoursWorked) {
        return hoursWorked * pricePerHour;
    }
}


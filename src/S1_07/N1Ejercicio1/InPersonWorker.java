package S1_07.N1Ejercicio1;

public class InPersonWorker extends Worker {
    public static double gasoline = 20.0;

    public InPersonWorker(String firstName, String lastName, double pricePerHour) {
        super(firstName, lastName, pricePerHour);
    }

    @Override
    public double calculateSou(int hoursWorked) {
        return (hoursWorked * pricePerHour) + gasoline;
    }
}


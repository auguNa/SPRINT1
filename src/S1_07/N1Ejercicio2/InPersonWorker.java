package S1_07.N1Ejercicio2;

public class InPersonWorker extends Worker {
    public static double gasoline = 20.0;

    public InPersonWorker(String firstName, String lastName, double pricePerHour) {
        super(firstName, lastName, pricePerHour);
    }

    @Override
    public double calculateSou(int hoursWorked) {
        return (hoursWorked * pricePerHour) + gasoline;
    }
    @Deprecated
    public void oldMethod() {
        System.out.println("This is an old method in InPersonWorker.");
    }
}


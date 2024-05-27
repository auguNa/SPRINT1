package S1_07.N1Ejercicio2;

public class OnlineWorker extends Worker {
    public static final double INTERNET_RATE = 50.0;

    public OnlineWorker(String firstName, String lastName, double pricePerHour) {
        super(firstName, lastName, pricePerHour);
    }
    @Override
    public double calculateSou(int hoursWorked) {
        return (hoursWorked * pricePerHour) + INTERNET_RATE;
    }
    @Deprecated
    public void oldMethod() {
        System.out.println("This is an old method in OnlineWorker.");
    }
}

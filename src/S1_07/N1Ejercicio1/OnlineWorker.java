package S1_07.N1Ejercicio1;

public class OnlineWorker extends Worker {
    public static final double INTERNET_RATE = 50.0;

    public OnlineWorker(String firstName, String lastName, double pricePerHour) {
        super(firstName, lastName, pricePerHour);
    }

    @Override
    public double calculateSou(int hoursWorked) {
        return (hoursWorked * pricePerHour) + INTERNET_RATE;
    }
}

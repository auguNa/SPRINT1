package S1_08.N1Ejercicio5;

public class Main {
    public static void main(String[] args) {
        PiProvider piProvider = () -> 3.1415;

        System.out.println("The value of Pi is: " + piProvider.getPiValue());
    }
}

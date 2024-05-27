package S1_08.N1Ejercicio5;

public class Main {
    public static void main(String[] args) {
        // Instantiating the interface with the value 3.1415
        PiProvider piProvider = () -> 3.1415;

        // Calling the getPiValue() method and printing the result
        System.out.println("The value of Pi is: " + piProvider.getPiValue());
    }
}

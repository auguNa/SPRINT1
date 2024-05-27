package S1_08.N1Ejercicio8;

public class Main {
    public static void main(String[] args) {
        // Implementing the reverse method using a lambda expression
        StringReverser reverser = str -> {
            StringBuilder reversed = new StringBuilder(str);
            return reversed.reverse().toString();
        };

        // Invoking the interface instance by passing it a string
        String originalString = "Hello, World!";
        String reversedString = reverser.reverse(originalString);

        // Checking if the result is correct
        System.out.println("Original string: " + originalString);
        System.out.println("Reversed string: " + reversedString);
    }
}

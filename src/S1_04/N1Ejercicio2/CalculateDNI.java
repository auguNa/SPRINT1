package S1_04.N1Ejercicio2;

import java.util.Scanner;

public class CalculateDNI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the DNI number with letter: ");
        String userDNI = sc.nextLine().toUpperCase();

        if (userDNI.length() == 9) {
            checkDNI(userDNI);
        } else {
            System.out.println("Error: The DNI has to be 9 characters.");
        }

        sc.close();
    }

    public static void checkDNI(String dni) {

        int dniNumber = Integer.parseInt(dni.substring(0, dni.length() - 1));
        char typedLetter = dni.charAt(dni.length() - 1);

        char computedLetter = calculateDniLetter(dniNumber);

        if (typedLetter == computedLetter) {
            System.out.println("The DNI is correct");
        } else {
            System.out.println("The typed letter is incorrect. The correct one is: " + computedLetter);
        }
    }

    public static char calculateDniLetter(int dniNumber) {
        String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        int indiceLetra = dniNumber % 23;
        return letrasDNI.charAt(indiceLetra);
    }
}


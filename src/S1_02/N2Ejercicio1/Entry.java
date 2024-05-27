package S1_02.N2Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entry {
    static Scanner sc = new Scanner(System.in);

    public static byte readByte(String message) {
        while (true) {
            try {
                System.out.println(message);
                return sc.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Format error. You must type a byte..");
                sc.next();
            }
        }
    }

    public static int readInt(String message) {
        while (true) {
            try {
                System.out.println(message);
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Format error. You must type a int..");
                sc.next();
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            try {
                System.out.println(message);
                return sc.nextFloat();

            } catch (InputMismatchException e) {
                System.out.println("Format error. You must type a float..");
                sc.next();
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            try {
                System.out.println(message);
                return sc.nextDouble();

            } catch (InputMismatchException e) {
                System.out.println("Format error. You must type a float..");
                sc.next();
            }
        }
    }

    public static char readChar(String message) {
        while (true) {
            try {
                System.out.println(message);
                String input = sc.next();
                if (input.length() != 1) {
                    throw new Exception("You must enter a character.");
                }
                return input.charAt(0);
            } catch (Exception e) {
                System.out.println("Format error " + e.getMessage());
            }
            sc.nextLine();
        }

    }

    public static String readString(String message) {
        sc.nextLine();
        String myString = "";
        boolean ok = false;
        do {
            System.out.println(message);
            try {
                myString = sc.nextLine();
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error. You must type a string..");
                sc.nextLine();
            }
        } while (!ok);
        return myString;
    }

    public static boolean readBoolean(String message) {

        boolean userInput = false;
        boolean answer = false;
        do {
            try {
                System.out.println(message);
                String input = sc.nextLine().toLowerCase();
                if (input.equalsIgnoreCase("true")) {
                    userInput = true;
                    answer = true;

                } else if (input.equalsIgnoreCase("false")) {
                    userInput = false;
                    answer = true;
                } else {
                    throw new Exception("Please enter 'true' or 'false'");
                }

            } catch (Exception e) {
                System.out.println("Format error.." + e.getMessage());

            }

        }
        while (!answer);
        return userInput;
    }

}



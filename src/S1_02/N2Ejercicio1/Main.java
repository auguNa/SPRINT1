package S1_02.N2Ejercicio1;


import static S1_02.N2Ejercicio1.Entry.*;

public class Main {
    public static void main(String[] args) {
        byte b = readByte("Enter a byte: ");
        System.out.println("Your data type is a byte: " + b);

        int i = readInt("Enter an integer: ");
        System.out.println("Your data type is a integer: " + i);

        float f = readFloat("Enter a float: ");
        System.out.println("Your data type is a float: " + f);

        double d = readDouble("Enter a double: ");
        System.out.println("Your data type is a double: " + d);

        char c = readChar("Enter a chararcter: ");
        System.out.println("Your data type is a character: " + c);


        String s = readString("Enter a string: ");
        System.out.println("Your data type is a string: " + s);

        boolean trueFalse = readBoolean("Enter True or False: ");
        System.out.println("Your data type: " + "'" + trueFalse + "'" + " is a boolean!");


    }
}

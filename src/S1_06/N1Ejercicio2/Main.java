package S1_06.N1Ejercicio2;


public class Main {
    public static <T> void main(String[] args) {
        Person person = new Person("Rafael", "Nadal", 32);
        GenericMethods.print(person, "This is a String", 99);
        GenericMethods.print("Another string", 3.14, true);
    }
}

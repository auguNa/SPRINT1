package S1_06.N2Ejercicio1;


public class Main {
    public static <T> void main(String[] args) {
        Person person = new Person("Rafael", "Nadal", 32);

        GenericMethods.printArguments(person, "This is a String", 99);
        GenericMethods.printArguments(true, "Another String", person);
    }
}

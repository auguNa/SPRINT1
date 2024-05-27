package S1_06.N2Ejercicio1;


public class Main {
    public static <T> void main(String[] args) {
        // Create an instance of Person
        Person person = new Person("Rafael", "Nadal", 32);

        // Call the generic method with different types of parameters
        GenericMethods.printArguments(person, "This is a String", 99);
        // Call the generic method with yet another set of parameters
        GenericMethods.printArguments(true, "Another String", person);
    }
}

package S1_06.N1Ejercicio1;

public class Main {
    public static <T> void main(String[] args) {
        // Create an instance of NoGenericMethods with different types of objects
        NoGenericMethods <T> example = new NoGenericMethods("String", 123, 45.67);

        // Print the objects
        System.out.println("Object 1: " + example.getObj1());
        System.out.println("Object 2: " + example.getObj2());
        System.out.println("Object 3: " + example.getObj3());

        // Swap positions of arguments in the constructor call
        NoGenericMethods example2 = new NoGenericMethods(45.67, "String", 123);

        // Print the objects
        System.out.println("Object 1: " + example2.getObj1());
        System.out.println("Object 2: " + example2.getObj2());
        System.out.println("Object 3: " + example2.getObj3());
    }
}

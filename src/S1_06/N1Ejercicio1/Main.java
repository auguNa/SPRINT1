package S1_06.N1Ejercicio1;

public class Main {
    public static <T> void main(String[] args) {
        NoGenericMethods <T> example = new NoGenericMethods("String", 123, 45.67);

        System.out.println("Object 1: " + example.getObj1());
        System.out.println("Object 2: " + example.getObj2());
        System.out.println("Object 3: " + example.getObj3());

        NoGenericMethods example2 = new NoGenericMethods(45.67, "String", 123);

        System.out.println("Object 1: " + example2.getObj1());
        System.out.println("Object 2: " + example2.getObj2());
        System.out.println("Object 3: " + example2.getObj3());
    }
}

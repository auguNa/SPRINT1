package S1_06.N1Ejercicio2;

public class GenericMethods<T, U, V> {
    public static <T, U, V> void print(T firstThingToPrint, U secondThingToPrint, V thirdThingToPrint) {
        System.out.println(firstThingToPrint);
        System.out.println(secondThingToPrint);
        System.out.println(thirdThingToPrint);
    }
}

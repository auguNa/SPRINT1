package S1_06.N2Ejercicio1;

import java.util.List;

public class GenericMethods<T, V, S> {
    public static <T, V> void printArguments(T arg1, String arg2, V arg3) {
        System.out.println(arg1);
        System.out.println(arg2);
        System.out.println(arg3);
    }
}

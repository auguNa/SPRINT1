package S1_01.N1Ejercicio1;

public class Main {
    public static void main(String[] args) {
        InstrumentoViento flauta = new InstrumentoViento("Flauta", 100);
        System.out.println(flauta.toString());
        System.out.println(flauta.tocar());

        InstrumentoCuerda guitarra = new InstrumentoCuerda("Guitarra", 200);
        System.out.println();
        System.out.println(guitarra.toString());
        System.out.println(guitarra.tocar());

        InstrumentoPercucion bateria = new InstrumentoPercucion("Bateria", 300);
        System.out.println();
        System.out.println(bateria.toString());
        System.out.println(bateria.tocar());
    }
}

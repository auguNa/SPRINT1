package S1_01.N1Ejercicio2;

public class Coche {

    private static final String MARCA = "Toyota";
    private static String modelo;
    private final int potencia;

    public Coche(String modelo, int potencia) {
        Coche.modelo = modelo;
        this.potencia = potencia;
    }

    public static void frenar() {
        System.out.println("El vehículo está frenando");
    }

    public void acelerar() {
        System.out.println("El vehículo está acelerando");
    }

    public static String getMarca() {
        return MARCA;
    }

    public static String getModelo() {
        return modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public static void setModelo(String modelo) {
        Coche.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "potencia=" + potencia +
                '}';
    }
}

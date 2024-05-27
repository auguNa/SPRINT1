package S1_01.N1Ejercicio2;

public class Main {

    public static void main(String[] args) {
        //metodo estatico
        Coche.frenar();

        //metodo no estatico
        Coche coche = new Coche("Corolla", 1000);
        coche.acelerar();

        //obtener atributos
        System.out.println("MARCA estatico final: " + Coche.getMarca());
        System.out.println("Modelo estatico coche: " + coche.getModelo());
        System.out.println("Potencia final coche: " + coche.getPotencia());
        System.out.println();

        Coche coche1 = new Coche("Hilux", 2500);
        System.out.println("Modelo estatico coche: " + coche1.getModelo());
        System.out.println("Potencia final coche: " + coche1.getPotencia());
        System.out.println("Cambiar el modelo a Aygo con un setter...");
        Coche.setModelo("Aygo");

        System.out.println();
        System.out.println("Los dos coches cogen el mismo modelo por estatico: " + "\n" + coche.toString() + coche.getModelo() + "\n" + coche1.toString() + coche1.getModelo());
    }
}

package S1_01.N2Ejercicio1;

public class Smartphone extends Telefono implements Camara, Reloj {
    public Smartphone(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public String fotografiar() {
        return "Se está haciendo una foto";
    }

    @Override
    public String alarma() {
        return "Está sonando la alarma";
    }
}

package S1_01.N1Ejercicio1;

public class InstrumentoCuerda extends Instrumento {
    public InstrumentoCuerda(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public String toString() {
        return "InstrumentoCuerda{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public String tocar() {
       return "Esta sonando un instumento de cuerda";

    }
}

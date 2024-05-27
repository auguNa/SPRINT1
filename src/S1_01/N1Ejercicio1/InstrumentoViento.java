package S1_01.N1Ejercicio1;

public class InstrumentoViento extends Instrumento {

    public InstrumentoViento(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public String toString() {
        return "InstrumentoViento{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public String tocar() {
       return "Esta sonando un instrumento de viento";
    }
}

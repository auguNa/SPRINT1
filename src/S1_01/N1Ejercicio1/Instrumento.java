package S1_01.N1Ejercicio1;

public abstract class Instrumento {
    static {
        System.out.println("La clase Instrumento ha sido cargada.");
    }

    protected String nombre;
    protected double precio;

    public Instrumento(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract String tocar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}


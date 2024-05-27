//line below to be commented when JAVA compile
package S1_05.N1Ejercicio5;

import java.io.Serializable;

public class Car implements Serializable {
    private static final long serialVersionUID = 1L;

    private String marca;
    private String modelo;

    public Car(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}

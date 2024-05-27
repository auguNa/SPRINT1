package S1_01.N2Ejercicio1;

public class Telefono {
    protected String marca;
    protected String modelo;

    public Telefono(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public  String llamar(String numero){
        return "Se llama:" + numero;
    }
}

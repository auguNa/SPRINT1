package S1_01.N2Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone("N001", "NOKIA");

        System.out.println(myPhone.alarma());
        System.out.println(myPhone.fotografiar());
        System.out.println(myPhone.llamar("66003342"));

    }
}
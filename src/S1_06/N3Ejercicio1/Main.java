package S1_06.N3Ejercicio1;

import S1_01.N2Ejercicio1.Smartphone;

public class Main {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();
        Generic generic = new Generic();

        // Pass Smartphone to the method limited by Phone
        generic.usePhone(myPhone);

        // Pass Smartphone to the method limited by Smartphone
        generic.useSmartphone(myPhone);
    }
}

package S1_06.N3Ejercicio1;

public class Generic {

    public <T extends Phone> void usePhone(T phone) {
        phone.call();
        // phone.makePhotos(); // This would cause a compile error
    }

    public <T extends SmartPhone> void useSmartphone(T smartphone) {
        smartphone.call();
        smartphone.makePhotos();
    }
}



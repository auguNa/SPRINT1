package S1_06.N3Ejercicio1;

import S1_01.N2Ejercicio1.Smartphone;

public class Generic {
    // Method accepting a type limited by the Phone interface.
    // This method can only call the call() method because it only knows the type implements Phone
    public <T extends Phone> void usePhone(T phone) {
        phone.call();
        // phone.makePhotos(); // This would cause a compile error


    }

    // Method accepting a type limited by the Smartphone class
    public <T extends SmartPhone> void useSmartphone(T smartphone) {
        smartphone.call();
        smartphone.makePhotos();
    }
}
/* The method in the Generic class limited by the Phone interface can only call methods defined in the Phone interface.
Therefore, usePhone cannot call the makePhotos() method because Phone does not define makePhotos().

The method in the Generic class limited by the Smartphone class can call both call() and makePhotos() methods because it knows that the type passed must be Smartphone or a subclass of Smartphone. */
package S1_06.N3Ejercicio1;

public class SmartPhone implements Phone{
    public SmartPhone() {
    }

    @Override
    public void call() {
        System.out.println("Making a call from Smartphone");
    }
    public void makePhotos() {
        System.out.println("Taking a photo with Smartphone");
    }
}

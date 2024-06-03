// 2 line below to be commented when JAVA compile
package S1_05.N1Ejercicio5;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String currentDirectoryPath = System.getProperty("user.dir");
        File currentDirectory = new File(currentDirectoryPath);

        Car car = new Car("Talbot", "1100");
        String fileSer = "car.ser";

        String filePath = currentDirectory + File.separator + "src" + File.separator + "S1_05" + File.separator + "N1Ejercicio5" + File.separator + fileSer;
        File file = new File(filePath);

        File parentDir = file.getParentFile();
        if (!parentDir.exists()) {
            parentDir.mkdirs();
        }

        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(car);
            System.out.println("Object successfully serialized.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Car deserializedCar = (Car) ois.readObject();
            System.out.println("Deserialized object:");
            System.out.println(deserializedCar);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


// 2 line below to be commented when JAVA compile
package S1_05.N1Ejercicio5;

import S1_05.N1Ejercicio5.Car;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Get current directory path
        String currentDirectoryPath = System.getProperty("user.dir");
        File currentDirectory = new File(currentDirectoryPath);

        // Create car object
        Car car = new Car("Talbot", "1100");
        String fileSer = "car.ser";

        // Construct file path
        String filePath = currentDirectory + File.separator + "src" + File.separator + "S1_05" + File.separator + "N1Ejercicio5" + File.separator + fileSer;
        File file = new File(filePath);

        // Ensure the directories exist
        File parentDir = file.getParentFile();
        if (!parentDir.exists()) {
            parentDir.mkdirs();
        }

        // Serialize the car object
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(car);
            System.out.println("Object successfully serialized.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Deserialize the car object
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Car deserializedCar = (Car) ois.readObject();
            System.out.println("Deserialized object:");
            System.out.println(deserializedCar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


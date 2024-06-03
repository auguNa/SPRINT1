//Comment the line below when compile
package S1_05.N3Ejercicio1;

import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            String currentDirectoryPath = System.getProperty("user.dir");
            File currentDirectory = new File(currentDirectoryPath);

            String inputDirPath = currentDirectoryPath;
            String encryptedDirPath = currentDirectory + File.separator + "src" + File.separator + "N3Ejercicio1" + File.separator + "S1_05_encrypted";
            String decryptedDirPath = currentDirectory + File.separator + "src" + File.separator + "N3Ejercicio1" + File.separator + "S1_05_decrypted";

            File inputDir = new File(inputDirPath);
            File encryptedDir = new File(encryptedDirPath);
            File decryptedDir = new File(decryptedDirPath);

            encryptedDir.mkdirs();
            decryptedDir.mkdirs();

            SecretKey secretKey = CryptoUtils.generateSecretKey();
            IvParameterSpec iv = CryptoUtils.generateIv();

            processDirectory(inputDir, encryptedDir, secretKey, iv, true);
            System.out.println("Archivos encriptados exitosamente.");

            processDirectory(encryptedDir, decryptedDir, secretKey, iv, false);
            System.out.println("Archivos desencriptados exitosamente.");

            // Opcional: Imprimir las claves para su uso posterior
            String encodedKey = CryptoUtils.secretKeyToString(secretKey);
            String encodedIv = CryptoUtils.ivToString(iv);
            System.out.println("Clave secreta (Base64): " + encodedKey);
            System.out.println("IV (Base64): " + encodedIv);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void processDirectory(File inputDir, File outputDir, SecretKey secretKey, IvParameterSpec iv, boolean encrypt) throws Exception {
        File[] files = inputDir.listFiles();

        if (files != null) {
            for (File file : files) {
                File outputFile = new File(outputDir, file.getName());
                if (file.isDirectory()) {
                    outputFile.mkdirs();
                    processDirectory(file, outputFile, secretKey, iv, encrypt);
                } else {
                    if (encrypt) {
                        CryptoUtils.encrypt(file, outputFile, secretKey, iv);
                    } else {
                        CryptoUtils.decrypt(file, outputFile, secretKey, iv);
                    }
                }
            }
        }
    }
}


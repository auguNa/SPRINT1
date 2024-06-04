//Comment the line below when compile
package S1_05.N3Ejercicio1;


import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.io.File;


public class Main {
    public static void main(String[] args) {
        try {
            String currentDirPath = System.getProperty("user.dir");
            // Paths de los directorios
            String inputDirPath = currentDirPath + File.separator + "src" + File.separator + "S1_05" + File.separator + "N3Ejercicio1";
            String encryptedDirPath = currentDirPath + File.separator + "src" + File.separator + "S1_05" + File.separator  + "S1_05_N3Ejercicio1_encrypted";
            String decryptedDirPath = currentDirPath + File.separator + "src" + File.separator + "S1_05" + File.separator   + "S1_05_N3Ejercicio1_decrypted";

            File inputDir = new File(inputDirPath);
            File encryptedDir = new File(encryptedDirPath);
            File decryptedDir = new File(decryptedDirPath);

            // Crear directorios de salida si no existen
            encryptedDir.mkdirs();
            decryptedDir.mkdirs();

            // Generar clave secreta y IV
            SecretKey secretKey = CryptoUtils.generateSecretKey();
            IvParameterSpec iv = CryptoUtils.generateIv();

            // Encriptar todos los archivos
            processDirectory(inputDir, encryptedDir, secretKey, iv, true);
            System.out.println("Archivos encriptados exitosamente.");

            // Desencriptar todos los archivos
            processDirectory(encryptedDir, decryptedDir, secretKey, iv, false);
            System.out.println("Archivos desencriptados exitosamente.");

            // Opcional: Imprimir las claves para su uso posterior
            String encodedKey = CryptoUtils.secretKeyToString(secretKey);
            String encodedIv = CryptoUtils.ivToString(iv);
            System.out.println("Clave secreta (Base64): " + encodedKey);
            System.out.println("IV (Base64): " + encodedIv);
        } catch (Exception e) {
            e.printStackTrace();
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

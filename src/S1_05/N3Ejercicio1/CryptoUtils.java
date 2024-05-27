//Comment the line below when compile
//package S1_05.N3Ejercicio1;

import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.SecureRandom;
import java.util.Base64;

public class CryptoUtils {
    private static final String ALGORITHM = "AES";
    private static final String TRANSFORMATION = "AES/CBC/PKCS5Padding";

    public static void encrypt(File inputFile, File outputFile, SecretKey secretKey, IvParameterSpec iv) throws Exception {
        doCrypto(Cipher.ENCRYPT_MODE, inputFile, outputFile, secretKey, iv);
    }

    public static void decrypt(File inputFile, File outputFile, SecretKey secretKey, IvParameterSpec iv) throws Exception {
        doCrypto(Cipher.DECRYPT_MODE, inputFile, outputFile, secretKey, iv);
    }

    private static void doCrypto(int cipherMode, File inputFile, File outputFile, SecretKey secretKey, IvParameterSpec iv) throws Exception {
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(cipherMode, secretKey, iv);

        try (FileInputStream inputStream = new FileInputStream(inputFile);
             FileOutputStream outputStream = new FileOutputStream(outputFile);
             CipherOutputStream cipherOutputStream = new CipherOutputStream(outputStream, cipher)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                cipherOutputStream.write(buffer, 0, bytesRead);
            }
        }
    }

    public static SecretKey generateSecretKey() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(ALGORITHM);
        keyGenerator.init(256);
        return keyGenerator.generateKey();
    }

    public static IvParameterSpec generateIv() {
        byte[] iv = new byte[16];
        new SecureRandom().nextBytes(iv);
        return new IvParameterSpec(iv);
    }

    public static String secretKeyToString(SecretKey secretKey) {
        return Base64.getEncoder().encodeToString(secretKey.getEncoded());
    }

    public static SecretKey stringToSecretKey(String key) {
        byte[] decodedKey = Base64.getDecoder().decode(key);
        return new SecretKeySpec(decodedKey, 0, decodedKey.length, ALGORITHM);
    }

    public static String ivToString(IvParameterSpec iv) {
        return Base64.getEncoder().encodeToString(iv.getIV());
    }

    public static IvParameterSpec stringToIv(String iv) {
        byte[] decodedIv = Base64.getDecoder().decode(iv);
        return new IvParameterSpec(decodedIv);
    }
}
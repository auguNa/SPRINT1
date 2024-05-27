//line below to be commented when JAVA compile
package S1_05.N2Ejercicio1;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Load configuration properties
        String propertiesPath = "C:\\Users\\augus\\Desktop\\BCN ACTIVA\\ITAcademy\\SPRINT1A\\src\\S1_05\\N2Ejercicio1\\config.properties";
        Properties properties = new Properties();
        try (InputStream input = new FileInputStream(propertiesPath)) {
            properties.load(input);
        } catch (IOException e) {
            System.err.println("Error loading configuration file: " + e.getMessage());
            return;
        }

        // Get properties
        String inputDirectoryPath = properties.getProperty("input.directory");
        String outputFilePath = properties.getProperty("output.file.path");

        // Validate input directory
        File inputDirectory = new File(inputDirectoryPath);
        if (!inputDirectory.isDirectory()) {
            System.out.println("The specified input path is not a directory.");
            return;
        }

        // Create the output file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            FolderLister directoryTree = new FolderLister();
            // List the content of the input directory recursively
            directoryTree.listDirectoryRecursive(inputDirectory, "", writer);
        } catch (IOException e) {
            System.err.println("Error while writing the file: " + e.getMessage());
        }
    }
}


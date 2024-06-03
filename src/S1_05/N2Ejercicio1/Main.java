//line below to be commented when JAVA compile
package S1_05.N2Ejercicio1;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String currentDirectoryPath = System.getProperty("user.dir");
        File currentDirectory = new File(currentDirectoryPath);

        String configuration = "config.properties";
        String filePath = currentDirectory + File.separator + "src" + File.separator + "S1_05" + File.separator + "N1Ejercicio5" + File.separator + configuration;

        Properties properties = new Properties();
        try (InputStream input = new FileInputStream(filePath)) {
            properties.load(input);
        } catch (IOException e) {
            System.err.println("Error loading configuration file: " + e.getMessage());
            return;
        }

        String inputDirectoryPath = properties.getProperty("input.directory");
        String outputFilePath = properties.getProperty("output.file.path");

        File inputDirectory = new File(inputDirectoryPath);
        if (!inputDirectory.isDirectory()) {
            System.out.println("The specified input path is not a directory.");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            FolderLister directoryTree = new FolderLister();
            directoryTree.listDirectoryRecursive(inputDirectory, "", writer);
        } catch (IOException e) {
            System.err.println("Error while writing the file: " + e.getMessage());
        }
    }
}


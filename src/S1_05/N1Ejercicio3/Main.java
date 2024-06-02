//line below to be commented when JAVA compile
package S1_05.N1Ejercicio3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String currentDirectoryPath = System.getProperty("user.dir");


        File currentDirectory = new File(currentDirectoryPath);


        if (!currentDirectory.isDirectory()) {
            System.out.println("The current path is not a directory.");
            return;
        }

        String file = "directory_tree.txt";
        String filePath = currentDirectory + File.separator + "src" + File.separator + "S1_05" + File.separator + "N1Ejercicio3" + File.separator + File.separator + file;
        //use this console path
         // String filePath = currentDirectory  + File.separator + file;
          //System.out.println("path "+ filePath);
        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            FolderLister directoryTree = new FolderLister();
            // List the content of the current directory recursively
            directoryTree.listDirectoryRecursive(currentDirectory, "", writer);
        } catch (
                IOException e) {
            System.err.println("Error while writing the file: " + e.getMessage());
        }
    }
}



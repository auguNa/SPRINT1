//line below to be commented when JAVA compile
package S1_05.N2Ejercicio1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class FolderLister {
    public void listDirectoryRecursive(File directory, String indent, BufferedWriter writer) throws IOException {
        // Get an array of file and directory names in the current directory
        String[] fileList = directory.list();

        // Sort the array in alphabetical order
        Arrays.sort(fileList);

        for (String file : fileList) {
            // Create a "File" object for current file
            File currentFile = new File(directory.getPath() + File.separator + file);

            // Get last modified time
            long lastModifiedTime = currentFile.lastModified();
            Date lastModifiedDate = new Date(lastModifiedTime);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            // Write into the file or current directory with its indent
            writer.write(indent + (currentFile.isDirectory() ? "D " : "F ") + file + " (Last modified: " + sdf.format(lastModifiedDate) + ")\n");

            // If current file is a directory, recursively list the content
            if (currentFile.isDirectory()) {
                listDirectoryRecursive(currentFile, indent + "    ", writer);
            }
        }
    }

    public void saveDirectoryTreeToFile(File directory, String outputPath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            // List the content of the current directory recursively and save it
            listDirectoryRecursive(directory, "", writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


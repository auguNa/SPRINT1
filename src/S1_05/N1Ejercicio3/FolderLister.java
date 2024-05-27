//line below to be commented when JAVA compile
package S1_05.N1Ejercicio3;

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

        // for each
        for (String file : fileList) {
            // Create an "object File" for current file
            File currentFile = new File(directory.getPath() + File.separator  + file);
            //   System.out.println("wearehere"+currentFile);
            // get last mod update
            long lastModifiedTime = currentFile.lastModified();
            Date lastModifiedDate = new Date(lastModifiedTime);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            // write into the file or current directory with his indent
            writer.write(indent + (currentFile.isDirectory() ? "D " : "F ") + file + " (Last modified: " + sdf.format(lastModifiedDate) + ")\n");

            // If current file is a dir, recursively list the content
            if (currentFile.isDirectory()) {
                listDirectoryRecursive(currentFile, indent + "    ", writer);
            }
        }
    }

    public void saveDirectoryTreeToFile(File directory, String outputPath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            // list the content of current dir in recursive way and SAVE IT
            listDirectoryRecursive(directory, "", writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


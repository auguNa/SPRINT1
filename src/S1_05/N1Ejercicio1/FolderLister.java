package S1_05.N1Ejercicio1;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class FolderLister {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the directory path: ");
        String folder = sc.nextLine();
        folderListening(folder);
    }

    public static void folderListening(String dir) {
        File folder = new File(dir);
        File[] files = folder.listFiles();
        if (files != null) {
            Arrays.sort(files);
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("The folder is empty or does not exist..");
        }
    }
}

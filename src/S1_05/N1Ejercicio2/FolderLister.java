package S1_05.N1Ejercicio2;

import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class FolderLister {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the directory path: ");
        String folder = sc.nextLine();
        folderListening(folder,0);
        sc.close();
    }

    public static void folderListening(String dir, int level) {
        File folder = new File(dir);
        File[] files = folder.listFiles();
        if (files != null) {
            Arrays.sort(files);
            for (File file : files) {
                Date date = new Date(file.lastModified());

                if(file.isDirectory()) {
                    for(int i = 0; i < level; i++){
                        System.out.print("*");
                    }
                    System.out.println("[D] " + file.getName() + " - Last modification: " + date);

                } else {
                    for(int i = 0; i < level; i++){
                        System.out.print("_");
                    }

                    System.out.println("[F] " + file.getName() + " - Last modification: " + date);
                }

                if(file.isDirectory()) {
                    folderListening(file.getPath(), level + 1);
                }
            }
        } else {
            System.out.println("The folder is empty or does not exist..");
        }
    }
}
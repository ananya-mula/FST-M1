package activities;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Activity14 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\0036AE744\\IdeaProjects\\FST_Java\\src\\main\\java\\activities\\activity 14");
        boolean fStatus = file.createNewFile();

        if(fStatus) {
            System.out.println("File created successfully!");
        } else {
            System.out.println("File already exists at this path.");
        }

        File fileUtil = FileUtils.getFile("C:\\Users\\0036AE744\\IdeaProjects\\FST_Java\\src\\main\\java\\activities\\activity 14");

        System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));

        File destDir = new File("resources");
        FileUtils.copyFileToDirectory(file, destDir);

        File newFile = FileUtils.getFile(destDir, "activity 14");
        String newFileData = FileUtils.readFileToString(newFile, "UTF8");
        //Print it
        System.out.println("Data in new file: " + newFileData);

    }
}

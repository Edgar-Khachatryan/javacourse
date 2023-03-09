package javaexceptions.ReadFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    /**
     * reading file
     */

    public void fileRead(){

        System.out.print("Enter the file name: ");
        Scanner name = new Scanner(System.in);
        String fileName;

        fileName = name.nextLine();

        try {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(line);
            }

            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}

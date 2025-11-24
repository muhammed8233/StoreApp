package CreatingFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Create {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter file or directory name");
        Path path = Paths.get(input.nextLine());
        if(Files.exists(path)){
            System.out.printf("The file name: %s%n", path.getFileName());
            System.out.printf("The Size: %d%n", Files.size(path));
            System.out.printf("Is absolute: %s%n", path.isAbsolute() ? "Yes" : "No");
            System.out.printf("Is a directory: %s%n", Files.isDirectory(path));
            System.out.printf("Last modified: %s%n", Files.getLastModifiedTime(path));
            System.out.printf("Path: %s%n", path);
            System.out.printf("To absolute %s%n", path.toAbsolutePath());
            System.out.printf("%s%n", Files.exists(path));
            System.out.printf("%s%n", Files.getOwner(path));
            System.out.printf("%s%n", Files.isExecutable(path));

        }else {
            System.out.println("File does not exist");
        }
    }
}

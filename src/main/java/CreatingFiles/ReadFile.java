package CreatingFiles;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try(Scanner output = new Scanner(Paths.get("student.txt"))){
            System.out.printf("%-10s%-12s%-12s%-12s%10s%n", "FirstName", "LastName",
                    "Age", "Department", "Student Id");
            while (output.hasNext()){
                System.out.printf("%-10s%-12s%-12d%-12s%10d%n", output.next(),
                        output.next(), output.nextInt(), output.next(), output.nextInt());
            }
        }
        catch(IOException | IllegalStateException |
                NoSuchElementException garri){
            garri.printStackTrace();
        }
    }
}

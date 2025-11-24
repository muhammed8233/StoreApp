package CreatingFiles;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class NewFile {
    public static void main(String[] args) {
        try(Formatter output = new Formatter("student.txt")){
            Scanner input = new Scanner(System.in);
            System.out.printf("%s%n%s%n", "FirstName, LastName, Age, Department, StudentId",
                    "use End-of-line terminator to close your entry");
            while(input.hasNext()){
                try{
                    output.format("%s %s %d %s %d%n", input.next(),
                            input.next(), input.nextInt(), input.next(), input.nextInt());
                }catch(InputMismatchException r){
                    System.err.println("Invalid input, please enter correct value");
                    input.nextLine();

                }
                System.out.println(">>>>..");
            }
        }catch (SecurityException| FileNotFoundException |
                FormatterClosedException exception ){
            exception.printStackTrace();
        }
    }
}

package School;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = new Student();
        boolean response = true;

        while (response) {
            System.out.println("""
                    press 1 to register student
                    press 2 to view student records
                    press 3 to update student record
                    press 4 to delete student record
                    press 5 to exit
                    """);
            int userInput = input.nextInt();

            if (userInput == 1) {
                System.out.println("Enter Name");
                String name = input.next();
                System.out.println("Enter Age");
                int age = input.nextInt();
                System.out.println("Enter phone number");
                String phoneNumber = input.next();

                Student createdRecord =  student.registerStudent(name, age, phoneNumber);
                System.out.println("Record for " + createdRecord.getName() + " has been created successfully.");


            }
            if (userInput == 2) {
                student.viewRegisteredStudent();

            }
            if (userInput == 3) {
                System.out.println("Enter the student id u would like to update");
                String studentId = input.next();
                System.out.println("Enter Name");
                String name = input.next();
                System.out.println("Enter Age");
                int age = input.nextInt();
                System.out.println("Enter phone number");
                String phoneNumber = input.next();
               Student updatedRecord = student.updateStudentRecord(studentId, name, age, phoneNumber);

                System.out.println("Record for " + updatedRecord.getName() + " has been updated successfully.");

            }
            if (userInput == 4) {
                System.out.println("Enter student id you want to delete");
                String studentId = input.next();
               Student deletedRecord = student.deleteStudentRecord(studentId);
                System.out.println("Record for " + deletedRecord.getName() + " has been  deleted successfully.");

            }
            if (userInput == 5) {
                System.exit(700);

            }
        }
    }
}

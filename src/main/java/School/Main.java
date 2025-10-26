package School;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = new Student();

        System.out.println("""
                press 1 to register student
                press 2 to view student records
                press 3 to update student record
                press 4 to delete student record
                press 5 to exit
                """);
        int userInput = input.nextInt();

        if(userInput == 1) {
            while (userInput == 1) {
                System.out.println("Enter Name");
                String name = input.next();
                System.out.println("Enter Age");
                int age = input.nextInt();
                System.out.println("Enter phone number");
                String phoneNumber = input.next();

                student.registerStudent(name, age, phoneNumber);


                System.out.println("press 1 to register another student or 2 to view register student ");
                userInput = input.nextInt();

            }
        }
        if(userInput == 2){

            student.viewRegisteredStudent();

        }
        if(userInput == 3){
            student.viewRegisteredStudent();

                System.out.println("Enter the student id u would like to update");
                String studentId = input.next();
                    System.out.println("Enter Name");
                    String name = input.next();
                    System.out.println("Enter Age");
                    int age = input.nextInt();
                    System.out.println("Enter phone number");
                    String phoneNumber = input.next();
                    student.updateStudentRecord(studentId, name, age, phoneNumber);
                    student.viewRegisteredStudent();



        }
        if(userInput == 4){
            student.viewRegisteredStudent();
            System.out.println("Enter student id you want to delete");
            String  studentId = input.next();
            student.deleteStudentRecord(studentId);
            student.viewRegisteredStudent();
        }
        if (userInput == 5){
            System.exit(700);
        }

    }
}

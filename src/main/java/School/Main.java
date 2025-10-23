package School;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<School> users = new ArrayList<>();
        Student student = new Student();
        Scanner input = new Scanner(System.in);
        int userInput = 0;

        System.out.println("welcome to semicolon");
        student.display( userInput);
         userInput = input.nextInt();

        if(userInput == 1) {
            while (userInput == 1){
                System.out.println("Enter Name");
                String name = input.next();
                System.out.println("Enter Age");
                int age = input.nextInt();
                System.out.println();
                int userid = input.nextInt();
                System.out.println("Enter Department");
                String department = input.next();
                System.out.println("Enter phone number");
                String phoneNumber = input.next();
                School record = (student.registerStudent(name, userid, age, department, phoneNumber));
                users.add(record);

                System.out.println("press 1 to create another user");
                userInput = input.nextInt();
            }
        }

        if (userInput == 2) {
            System.out.println("what would you like to update"+"\n"+ "enter index of user");
             int index = input.nextInt();
                    System.out.println("Enter Name");
                    String name = input.next();
                    System.out.println("Enter Age");
                    int age = input.nextInt();
                    System.out.println();
                    int userid = input.nextInt();
                    System.out.println("Enter Department");
                    String department = input.next();
                    System.out.println("Enter phone number");
                    String phoneNumber = input.next();
                    School updateW = student.registerStudent(name, userid, age, department, phoneNumber);
                    users.set(index, updateW);

            for (int i = 0; i < users.size(); i++) {
                System.out.println("Name: " + users.get(i).getName() + "\n" + "Age: " + users.get(i).getAge()
                        +"\n"+ "Userid: " + users.get(i).getUserid() + "\n" + "Department: " + users.get(i).getDepartment()
                        + "\n" + "TEL: "+ users.get(i).getPhoneNumber());
            }

        }
        if (userInput == 3) {
            for (int i = 0; i < users.size(); i++) {
                System.out.println("Name: " + users.get(i).getName() + "\n" + "Age: " + users.get(i).getAge()
                        +"\n"+ "Userid: " + users.get(i).getUserid() + "\n" + "Department: " + users.get(i).getDepartment()
                        + "\n" + "TEL: "+ users.get(i).getPhoneNumber());
            }

            System.out.println("please enter id for user you want to delete");
            int id = input.nextInt();
            for (int i = 0; i < users.size(); i++) {
                if(id == users.get(i).getUserid()) {
                    users.remove(id);
                }
            }


            for (int i = 0; i < users.size(); i++) {
                System.out.println("Name: " + users.get(i).getName() + "\n" + "Age: " + users.get(i).getAge()
                        +"\n"+ "Userid: " + users.get(i).getUserid() + "\n" + "Department: " + users.get(i).getDepartment()
                        + "\n" + "TEL: "+ users.get(i).getPhoneNumber());
            }
        }
        if(userInput == 4) {
            for (int i = 0; i < users.size(); i++) {
                System.out.println("Name: " + users.get(i).getName() + "\n" + "Age: " + users.get(i).getAge()
                +"\n"+ "Userid: " + users.get(i).getUserid() + "\n" + "Department: " + users.get(i).getDepartment()
                + "\n" + "TEL: "+ users.get(i).getPhoneNumber());
                System.console();
            }
        }
    }
}

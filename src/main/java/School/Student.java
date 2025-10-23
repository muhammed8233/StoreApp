package School;

public class Student {

    public School registerStudent(String name, int userid, int age, String department, String phoneNumber){
        School school = new School();
        school.setName(name);
        school.getUserid();
        school.setAge(age);
        school.setDepartment(department);
        school.setPhoneNumber(phoneNumber);

        return school;
    }


    public void display(int userInput){
        System.out.println("""
                         press 1 to create another user
                         press 2 to update user
                         press 3 to delete user
                         press 4 to display list of record
                         press 5 to exit
                         """);

    }
}

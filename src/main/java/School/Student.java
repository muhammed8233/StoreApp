package School;

import java.util.ArrayList;


public  class Student {
    private String name;
    private String userid;
    private int age;
    private String phoneNumber;

    ArrayList<Student> records = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public Student registerStudent(String name, int age, String phoneNumber) {
        Student student = new Student();
        student.setUserid("psc/2025/" + records.size()+1);
        student.setName(name);
        student.setAge(age);
        student.setPhoneNumber(phoneNumber);

        records.add(student);

        return student;

    }

    public Student viewRegisteredStudent() {
        Student student = new Student();
        System.out.printf("%20s%20s%20s%20s%n","NAME", "AGE", "USER ID", "TEL");
        for (int i = 0; i < records.size(); i++) {
            System.out.printf("%20s%20d%20s%20s%n", records.get(i).getName(), records.get(i).getAge()
                     , records.get(i).getUserid(), records.get(i).getPhoneNumber());
        }
        return student;
    }

    public Student updateStudentRecord(String id, String newName, int newAge,  String newPhoneNumber ){
        for (Student record : records) {
            if (record.getUserid().equalsIgnoreCase(id)) {
                record.setName(newName);
                record.setAge(newAge);
                record.setPhoneNumber(newPhoneNumber);

                return record;
            }
        }
        throw new IllegalArgumentException("userid does not exist");
    }

    public Student deleteStudentRecord(String id){
        Student student = new Student();
        records.removeIf(Student -> Student.getUserid().equalsIgnoreCase(id));

        return student;
    }
}

package School;

import java.security.SecureRandom;

public class School {
    private String name;
    private  int userid;
    private String department;
    private  int age;
    private String phoneNumber;

    SecureRandom  secure = new SecureRandom();

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getUserid() {
        return userid;
    }

    public void generateUserid(int userid) {
        for (int i = 1; i <= 8; i++) {
             userid = 1 + secure.nextInt(6);
            System.out.print(userid);

        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

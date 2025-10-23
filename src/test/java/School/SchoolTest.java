package School;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {
    School school = new School();

    @Test
    void setDepartment() {
        school.setDepartment("chemistry");
        assertEquals("chemistry", school.getDepartment());
    }

    @Test
    void setName() {
        school.setName("abubakr bala");
        assertEquals("abubakr bala", school.getName());
    }

    @Test
    void setAge(){
        school.setAge(19);
        assertEquals(19, school.getAge());
    }

    @Test
    void setPhoneNumber() {
        school.setPhoneNumber("09043225543");
        assertEquals("09043225543", school.getPhoneNumber());
    }
    @Test
    void generateUserid(){
         school.generateUserid(8);
        System.out.print( school.getUserid());
    }
}